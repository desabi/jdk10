package com.desabisc.jdk10.collections;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Unmodifiable {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");

        // Pre-Java 10: You would wrap a collection in Collections.unmodifiableList()
        List<String> unmodifiableList = Collections.unmodifiableList(list);

        // Java 10: Use Collectors.toUnmodifiableList() for a direct approach
        List<String> unmodifiableList1 = list.stream()
                .collect(Collectors.toUnmodifiableList());

    }
}
