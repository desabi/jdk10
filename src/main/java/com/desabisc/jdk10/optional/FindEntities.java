package com.desabisc.jdk10.optional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Finding Entities in Collections
 * You might have a collection of entities (like a list of products) and want to find a specific entity based on some criteria.
 * If the entity isn't found, you throw an exception.
 */
public class FindEntities {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product(101, "Laptop"),
                new Product(102, "Phone"),
                new Product(103, "Monitor"),
                new Product(104, "PC"),
                new Product(105, "Tablet")
        );

        // Before Java 10 (Using get()):
        Optional<Product> productOptional = products.stream()
                .filter(product -> product.getId().equals(103))
                .findFirst();

        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            System.out.println(product.getName());
        } else {
            throw new NoSuchElementException("Product not found");
        }

        // With Java 10 (orElseThrow()):
        var product = products.stream()
                .filter(p -> p.getId().equals(105))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Product not found"));

        System.out.println(product.getName());

        // The orElseThrow() method streamlines the code and makes it easier to understand by eliminating the if statement.

    }
}
