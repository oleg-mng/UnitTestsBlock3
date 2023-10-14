package com.example.tdd;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;
    private boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
    public void logout(){
        isAuthenticate = false;

    }
    public void logIn(){
        isAuthenticate = true;

    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }
}