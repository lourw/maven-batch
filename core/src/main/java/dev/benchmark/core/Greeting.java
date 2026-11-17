package dev.benchmark.core;

import dev.benchmark.utils.Strings;

/** Builds the greeting for a name. */
public final class Greeting {
  private Greeting() {}

  /** Returns the greeting for the given name. */
  public static String forName(String name) {
    return "Hello, " + Strings.capitalize(name) + "!";
  }
}
