package com.desabisc.jdk10.optional;


import java.util.Optional;

/**
 * Validating Input Data
 * In web applications, when handling incoming requests, you may need to validate that a required field is present.
 * If the field is missing, you could throw an exception.
 */
public class ValidateInputData {
    public static void main(String[] args) {
        MyRequest request = new MyRequest();

        // Before Java 10 (Using get()):
        Optional<String> emailOptional = Optional.ofNullable(request.getParameter("email"));

        if (emailOptional.isPresent()) {
            String email = emailOptional.get();
            System.out.println("Processing email: " + email);
        } else {
            throw new IllegalArgumentException("Email is required");
        }

        // With Java 10 (orElseThrow()):
        var email = Optional.ofNullable(request.getParameter("email"))
                .orElseThrow(() -> new IllegalArgumentException("Email is required"));
        System.out.println("Processing email: " + email);

    }
}
