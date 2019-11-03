package bm.util;

import bm.BmException;

public class Strings {
  public static String requireNotEmpty(String name) {
    if (name == null || name.isEmpty()) {
      throw new BmException("not null");
    }

    return name;
  }
}
