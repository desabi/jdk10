package com.desabisc.jdk10.optional;

import java.util.Optional;

/**
 *
 */
public class OrElseThrow {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        // Pre-Java 10: Retrieve value or throw exception
        String valueA = optional.get();  // Throws NoSuchElementException if empty

        // Java 10: More explicit method
        String valueB = optional.orElseThrow();  // Clearer and preferred method

    }
}
