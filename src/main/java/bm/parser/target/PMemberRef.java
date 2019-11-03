package bm.parser.target;

import bakasoft.json.JsonString;
import bakasoft.json.JsonValue;

import java.util.stream.Collectors;

public class PMemberRef extends PElement {

    public PNameList names;

    @Override
    public JsonValue toJson() {
        return new JsonString(
                names.stream().map(name -> name.text).collect(Collectors.joining("."))
        );
    }

}
