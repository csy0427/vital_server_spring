package com.example.demo1.accounts;

public class UserDuplicatedException extends RuntimeException{
    String userName;
    public UserDuplicatedException(String userName) {
        this.userName=userName;
    }
    public String getUsername(){
        return userName;
    }
}
