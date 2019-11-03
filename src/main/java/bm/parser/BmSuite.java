package bm.parser;

import bakasoft.json.Json;
import org.gramat.Tape;
import bm.parser.target.GSourceFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BmSuite {

    private final Path bmFile;
    private final Path rootDir;

    private final List<Predicate<String>> ignoreds;

    public BmSuite(String bmFilePath) throws ParseException {
        bmFile = Paths.get(bmFilePath);

        rootDir = bmFile.getParent();

        if (rootDir == null) {
            throw new RuntimeException(); // TODO error message
        }

        ignoreds = new ArrayList<>();

        ignoreds.add(Pattern.compile(".*/\\.DS_Store").asPredicate());
        ignoreds.add(Pattern.compile(".*/\\.git/.*").asPredicate());
    }

    public List<GSourceFile> parseSourceFiles() throws ParseException {
        BmGrammar grammar = new BmGrammar();
        ArrayList<GSourceFile> sourceFiles = new ArrayList<>();
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
            throw new ParseException(e);
        }

        for (Path file : files) {
            System.out.println("Parsing " + file + "...");

            byte[] data;

            try {
                data = Files.readAllBytes(file);
            } catch (IOException e) {
                throw new ParseException(e);
            }

            String text = new String(data);
            Tape tape = new Tape(text, rootDir.relativize(file).toString());
            GSourceFile sourceFile = grammar.parseFile(tape);
            sourceFile.fileName = file.getFileName().toString();

            System.out.println(Json.stringify(sourceFile, 2));

            sourceFiles.add(sourceFile);
        }

        return sourceFiles;
    }

    public Path getRootDirectory() { return rootDir; }

}
