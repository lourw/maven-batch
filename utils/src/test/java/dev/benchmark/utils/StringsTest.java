package dev.benchmark.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringsTest {
  @Test
  void capitalizesTheFirstLetter() {
    assertEquals("Maven", Strings.capitalize("maven"));
  }

  @Test
  void keepsAnEmptyValue() {
    assertEquals("", Strings.capitalize(""));
  }
}
