package dev.benchmark.app;

import dev.benchmark.service.GreetingService;
import java.util.List;

/** Prints a greeting for each argument. */
public final class App {
  private App() {}

  /** Returns the lines the app prints for the given arguments. */
  public static List<String> run(String[] args) {
    return new GreetingService().greetAll(List.of(args));
  }

  /** Entry point. */
  public static void main(String[] args) {
    run(args).forEach(System.out::println);
  }
}
