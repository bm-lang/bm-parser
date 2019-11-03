package bm.parser.util;

import bm.parser.ParserException;

public class Strings {
  public static String requireNotEmpty(String name) {
    if (name == null || name.isEmpty()) {
      throw new ParserException("not null");
    }

    return name;
  }
}
