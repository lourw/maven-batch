package dev.benchmark.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetingTest {
  @Test
  void greetsByCapitalizedName() {
    assertEquals("Hello, Nx!", Greeting.forName("nx"));
  }
}
