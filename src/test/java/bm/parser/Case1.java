package bm.parser;

import bakasoft.json.Json;
import org.junit.Test;

public class Case1 {

  @Test
  public void test() {
    try {
      BmSuite suite = new BmSuite("../bm-core/bm.json");

      suite.parseSourceFiles();

      System.out.println(Json.stringify(suite, 2));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
