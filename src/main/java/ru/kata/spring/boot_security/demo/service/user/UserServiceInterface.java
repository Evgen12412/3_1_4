package ru.kata.spring.boot_security.demo.service.user;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {
     List<User> allUsers();

    void saveUser(User user);

    User findUserById(Long userid);

    void deleteUser(Long userId);

    void update(Long id, User user);
    boolean checkLogin(User user);

    Optional<User> findByUserName(String username);
}
