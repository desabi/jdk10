package com.desabisc.jdk10.collections;

import java.util.List;

/**
 * Real-World Use Case: Imagine you have a method that returns a list of configuration keys. You
 * want to ensure that the caller cannot modify the original list:
 */
public class CopyOfUseCase {

  private static final List<String> KEYS = List.of("host", "post", "timeout");

  public static List<String> getConfigKeys() {
    // Return and unmodifiable copy of the keys
    return List.copyOf(KEYS);
  }

  public static void main(String[] args) {
    List<String> keys = CopyOfUseCase.getConfigKeys();
    System.out.println("Config Keys: " + keys);

    // try to modify the returned list
    try {
      keys.add("newKey");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot modify the configuration keys!");
    }
  }
}
