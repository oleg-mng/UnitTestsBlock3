package com.example.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    private User user1;
    private User user2;
    private User adminUser;

    private UserRepository userRepository;

    //Создаем метод инициализации пользователей и админа

    @BeforeEach
    public void setUp() {
        user1 = new User("user1", "891pl", false);
        user2 = new User("user2", "891pl18", false);
        adminUser = new User("adminUser", "pl01", true);

        userRepository = new UserRepository();

        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(adminUser);

    }

    //реализовываем метод проверки (после разлогинивания) остался ли пользователь авторизован

    @Test
    public void checkLogOutNoAdminUsers() {
        userRepository.logOutNoAdminUsers();

        boolean a1 = user1.isAuthenticate();
        boolean a2 = user2.isAuthenticate();
        boolean a3 = adminUser.isAuthenticate();

        assertFalse(a1);
        assertFalse(a2);
        assertTrue(a3);

    }
}