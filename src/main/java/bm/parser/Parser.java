package bm.parser;

import bakasoft.json.Json;
import bm.parser.target.PSuite;
import org.gramat.Tape;
import bm.parser.target.PSourceFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Parser {

    private final Grammar grammar;
    private final Path bmFile;
    private final Path rootDir;

    private final List<Predicate<String>> ignoreds;

    public Parser(String bmFilePath) throws ParserException {
        grammar = new Grammar();
        bmFile = Paths.get(bmFilePath);

        rootDir = bmFile.getParent();

        if (rootDir == null) {
            throw new RuntimeException(); // TODO error message
        }

        ignoreds = new ArrayList<>();

        ignoreds.add(Pattern.compile(".*/\\.DS_Store").asPredicate());
        ignoreds.add(Pattern.compile(".*/\\.git/.*").asPredicate());
    }

    public PSuite parseSuite() {
        String name = rootDir.getFileName().toString();
        List<PSourceFile> sourceFiles = parseSourceFiles();

        return new PSuite(name, sourceFiles);
    }

    public List<PSourceFile> parseSourceFiles() throws ParserException {
        ArrayList<PSourceFile> sourceFiles = new ArrayList<>();
        List<Path> files;

        try {
            files = Files.walk(rootDir)
                    .filter(path -> !path.equals(bmFile))
                    .filter(path -> !Files.isDirectory(path))
                    .filter(path -> {
                        for (Predicate<String> ignored : ignoreds) {
                            if (ignored.test(path.toString())) {
                                return false;
                            }
                        }

                        return true;
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new ParserException(e);
        }

        for (Path file : files) {
            System.out.println("Parsing " + file + "...");

            byte[] data;

            try {
                data = Files.readAllBytes(file);
            } catch (IOException e) {
                throw new ParserException(e);
            }

            String text = new String(data);
            Path relFile = rootDir.relativize(file);
            String[] modulePath = toStringArray(relFile.getParent());
            String fileName = relFile.getFileName().toString();
            PSourceFile sourceFile = parseSourceFile(text, fileName, modulePath);

            System.out.println(Json.stringify(sourceFile, 2));

            sourceFiles.add(sourceFile);
        }

        return sourceFiles;
    }

    public PSourceFile parseSourceFile(String text, String fileName, String[] modulePath) {
        String path = modulePath.length > 0 ? String.join("/", modulePath) : "";
        Tape tape = new Tape(text, path + fileName);
        PSourceFile sourceFile = grammar.parseFile(tape);
        sourceFile.modulePath = modulePath;
        sourceFile.fileName = fileName;
        return sourceFile;
    }

    private String[] toStringArray(Path path) {
        return StreamSupport.stream(path.spliterator(), false)
            .map(Path::toString)
            .toArray(String[]::new);
    }

    public Path getRootDirectory() { return rootDir; }

}
