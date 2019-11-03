package bm.parsing;

import bakasoft.json.JsonString;
import bakasoft.json.JsonValue;

import java.util.stream.Collectors;

public class GMemberRef extends GElement {

    public GNameList names;

    @Override
    public JsonValue toJson() {
        return new JsonString(
                names.stream().map(name -> name.text).collect(Collectors.joining("."))
        );
    }

}
