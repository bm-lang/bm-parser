package bm.parser;

import bakasoft.json.Json;
import bm.parser.target.PSuite;
import org.junit.Test;

public class Case1 {

  @Test
  public void test() {
    try {
      Parser parser = new Parser("../bm-core/bm.json");

      PSuite suite = parser.parseSuite();

      System.out.println(Json.stringify(suite, 2));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
