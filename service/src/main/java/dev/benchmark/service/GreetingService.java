package dev.benchmark.service;

import dev.benchmark.core.Greeting;
import java.util.List;

/** Greets a list of names. */
public final class GreetingService {
  /** Returns one greeting per name, in order. */
  public List<String> greetAll(List<String> names) {
    return names.stream().map(Greeting::forName).toList();
  }
}
