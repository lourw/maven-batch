package dev.benchmark.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class GreetingServiceTest {
  @Test
  void greetsEveryName() {
    assertEquals(
        List.of("Hello, Nx!", "Hello, Maven!"),
        new GreetingService().greetAll(List.of("nx", "maven")));
  }
}
