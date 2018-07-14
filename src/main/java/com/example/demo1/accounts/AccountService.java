package com.example.demo1.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository repository;



    public Account createAccount(AccountDto.Create dto) {
        Account account=new Account();
        return account;

    }


    public Account getAccount(Long id) {
        Account account=new Account();
        if(account==null) throw new AccountNotFoundException(id);
        return account;
    }

    public Account updateAccount(String id, AccountDto.Update updateDto) {
        Account account=new Account();
        return account;
    }

    public void deleteAccount(Long id) {
        repository.delete(getAccount(id));
    }
}
