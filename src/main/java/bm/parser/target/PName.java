package bm.parser.target;

import bakasoft.json.JsonString;
import bakasoft.json.JsonValue;

public class PName extends PElement {

  public String text;

  @Override
  public JsonValue toJson() {
    return text != null ? new JsonString(text) : null;
  }

}
