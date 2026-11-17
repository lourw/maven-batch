package dev.benchmark.utils;

/** String helpers shared by every module. */
public final class Strings {
  private Strings() {}

  /** Returns the value with its first letter in upper case. */
  public static String capitalize(String value) {
    if (value == null || value.isEmpty()) {
      return value;
    }
    return Character.toUpperCase(value.charAt(0)) + value.substring(1);
  }
}
