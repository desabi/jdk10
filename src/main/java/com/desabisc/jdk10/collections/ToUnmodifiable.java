package com.desabisc.jdk10.collections;

import com.desabisc.jdk10.optional.User;
import com.desabisc.jdk10.optional.UserRepository;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * In Java 10, new methods were added to the Collectors utility class for creating unmodifiable
 * (immutable) collections, namely Collectors.toUnmodifiableList(), Collectors.toUnmodifiableSet(),
 * and Collectors.toUnmodifiableMap(). These methods are useful when you want to create immutable
 * collections directly from streams, ensuring that any attempt to modify them will result in an
 * UnsupportedOperationException.
 */
public class ToUnmodifiable {

  public static void main(String[] args) {
    var userRepository = new UserRepository();

    var list = userRepository.findAll();

    // Pre-Java 10: You would wrap a collection in Collections.unmodifiableList()
    var users = Collections.unmodifiableList(list);

    // Java 10: Use Collectors.toUnmodifiableList() for a direct approach
    var unmodifiableUsers = users.stream().collect(Collectors.toUnmodifiableList());

    // With Collectors.toUnmodifiableList(), you directly create an immutable list during
    // the stream collection phase, avoiding the need for wrapping the list
    // in Collections.unmodifiableList().

    unmodifiableUsers.add(new User("Alice"));  // Throws UnsupportedOperationException
  }
}
