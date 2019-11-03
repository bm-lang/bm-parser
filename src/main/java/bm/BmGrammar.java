package bm;

import bm.parsing.*;
import bm.parsing.expressions.GExpression;
import bm.parsing.instructions.GInstruction;
import bm.util.ClassFinder;
import org.gramat.Tape;
import org.gramat.elements.Element;
import org.gramat.Gramat;
import bm.parsing.GModuleAccess;

import java.util.Map;

public class BmGrammar {

    private final org.gramat.elements.Element fileParser;

    public BmGrammar() {
        ClassFinder classFinder = new ClassFinder();
        classFinder.addPackageOf(GElement.class);
        classFinder.addPackageOf(GInstruction.class);
        classFinder.addPackageOf(GExpression.class);

        Gramat gramat = new Gramat();
        gramat.addParser("ModuleAccess", GModuleAccess::convert);
        gramat.addParser("FieldMode", GFieldMode::convert);
        gramat.addParser("MemberModifier", GMemberModifier::convert);
        gramat.addParser("OperatorMode", GOperatorMode::convert);

        gramat.setTypeResolver(name -> classFinder.findClass("G" + name));

        gramat.load("./src/main/resources/bm.gmt");

        Map<String, Element> result = gramat.compile();

        fileParser = result.get("SourceFile");
    }

    public GSourceFile parseFile(String path) {
        Tape tape = Tape.fromFile(path);

        return parseFile(tape);
    }

    public GSourceFile parseFile(Tape tape) {
        return (GSourceFile) fileParser.capture(tape);
    }

}
