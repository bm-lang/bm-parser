package bm.parsing;

import bakasoft.json.JsonString;
import bakasoft.json.JsonValue;

import java.util.Objects;

public class GName extends GElement {

  public String text;

  @Override
  public JsonValue toJson() {
    return text != null ? new JsonString(text) : null;
  }

}
