package dev.benchmark.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void greetsEachArgument() {
    assertEquals(List.of("Hello, World!"), App.run(new String[] {"world"}));
  }
}
