package com.example;

import com.example.tdd.User;
import com.example.tdd.UserRepository;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("user1", "891pl", false);
        User user2 = new User("user2", "891pl18", false);
        User adminUser = new User("adminUser", "pl01", true);

        UserRepository userRepository= new UserRepository();

        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(adminUser);
    }
}