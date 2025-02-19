package com.desabisc.jdk10.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The static factory methods List.copyOf(), Set.copyOf(), and Map.copyOf() were introduced in
 * Java 10 as part of the API enhancements.
 * These methods allow you to create unmodifiable copies of existing collections.
 * Once created, the resulting collections cannot be modified (i.e., you cannot add, remove, or update elements).
 */
public class CopyOfEg {
  public static void main(String[] args) {
    copyOfListEg();
    copyOfSetEg();
  }

  static void copyOfListEg() {
    // Create a mutable list
    List<String> mutableList = new ArrayList<>();
    mutableList.add("Apple");
    mutableList.add("Banana");
    mutableList.add("Cherry");

    // Create an unmodifiable copy of the list
    List<String> unmodifiableList  = List.copyOf(mutableList);

    // try to modify the unmodifiable list (this will throw an exception)
    try {
      unmodifiableList.add("Date"); // UnsupportedOperationException
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot modify the unmodifiable list!");
    }

    System.out.println("Unmodifiable List: " + unmodifiableList);
  }

  static void copyOfSetEg() {
    // Create a mutable set
    Set<String> mutableSet = new HashSet<>();
    mutableSet.add("Red");
    mutableSet.add("Green");
    mutableSet.add("Blue");

    // Create and unmodifiable copy of the set
    Set<String> unmodifiableSet = Set.copyOf(mutableSet);

    // Try to modify the unmodifiable set (this will throw an exception)
    try {
      unmodifiableSet.add("Yellow"); // UnsupportedOperationException
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot modify the unmodifiable set!");
    }

    // Print the unmodifiable set
    System.out.println("Unmodifiable Set: " + unmodifiableSet);
  }

  static void copyOfMapEg() {
    // Create a mutable map
    Map<String, Integer> mutableMap = new HashMap<>();
    mutableMap.put("Apple", 1);
    mutableMap.put("Banana", 2);
    mutableMap.put("Cherry", 3);

    // Create an unmodifiable copy of the map
    Map<String, Integer> unmodifiableMap = Map.copyOf(mutableMap);

    // Try to modify the unmodifiable map (this will throw an exception)
    try {
      unmodifiableMap.put("Date", 4);
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot modify the unmodifiable map!");
    }

    // Print the unmodifiable map
    System.out.println("Unmodifiable Map: " + unmodifiableMap);
  }
}
