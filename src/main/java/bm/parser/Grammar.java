package bm.parser;

import bm.parser.target.*;
import bm.parser.target.expressions.PExpression;
import bm.parser.target.instructions.PInstruction;
import bm.parser.util.ClassFinder;
import org.gramat.Tape;
import org.gramat.elements.Element;
import org.gramat.Gramat;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Grammar {

    private final org.gramat.elements.Element fileParser;

    public Grammar() {
        ClassFinder classFinder = new ClassFinder();
        classFinder.addPackageOf(PElement.class);
        classFinder.addPackageOf(PInstruction.class);
        classFinder.addPackageOf(PExpression.class);

        Gramat gramat = new Gramat();
        gramat.addParser("ModuleAccess", PModuleAccess::convert);
        gramat.addParser("FieldMode", PFieldMode::convert);
        gramat.addParser("MemberModifier", PMemberModifier::convert);
        gramat.addParser("OperatorMode", POperatorMode::convert);

        gramat.setTypeResolver(name -> classFinder.findClass("P" + name));

        URL url = Grammar.class.getResource("/bm.gmt");
        if (url == null) {
            throw new RuntimeException("Resource not found: bm.gmt");
        }
        Path path;
        try {
            path = Paths.get(url.toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        gramat.load(path);


        Map<String, Element> result = gramat.compile();

        fileParser = result.get("SourceFile");
    }

    public PSourceFile parseFile(String path) {
        Tape tape = Tape.fromFile(path);

        return parseFile(tape);
    }

    public PSourceFile parseFile(Tape tape) {
        return (PSourceFile) fileParser.capture(tape);
    }

}
