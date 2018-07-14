package com.example.demo1.accounts;

public class AccountNotFoundException extends RuntimeException{
    Long userId;
    public AccountNotFoundException(Long userId){this.userId=userId;}
    public Long getId(){return userId;}
}
