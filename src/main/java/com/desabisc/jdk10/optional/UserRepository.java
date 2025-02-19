package com.desabisc.jdk10.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    public Optional<User> findById(Long id) {
        return null;
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        users.add(new User("UserNameA"));
        users.add(new User("UserNameB"));
        users.add(new User("UserNameC"));
        users.add(new User("UserNameD"));
        users.add(new User("UserNameE"));
        return users;
    }
}
