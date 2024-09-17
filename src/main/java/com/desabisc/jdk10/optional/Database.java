package com.desabisc.jdk10.optional;

import java.util.Optional;

/**
 * Fetching Data from a Database
 * Consider a situation where you're retrieving data from a database using a repository method. The repository might
 * return an Optional to indicate that the result could be empty if no matching data is found.
 */
public class Database {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // Before Java 10 (Using get()):
        Optional<User> userOptional = userRepository.findById(1L);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            System.out.println(user.getName());
        } else {
            throw new RuntimeException("User not found");
        }

        // With Java 10 (orElseThrow()):
        var user = userRepository.findById(1L).orElseThrow(() -> new RuntimeException("User not found"));
        System.out.println(user.getName());

        // If a user with the given ID is found, orElseThrow() returns the User object.
        // If not, it throws the RuntimeException with the message "User not found."
        // This simplifies the code by removing the need for an explicit isPresent() check, making it cleaner and easier to maintain.
    }
}
