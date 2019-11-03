package bm.parser;

import bm.parser.target.*;
import bm.parser.target.expressions.PExpression;
import bm.parser.target.instructions.PInstruction;
import bm.parser.util.ClassFinder;
import org.gramat.Tape;
import org.gramat.elements.Element;
import org.gramat.Gramat;

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

        gramat.load("./src/main/resources/bm.gmt");

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
