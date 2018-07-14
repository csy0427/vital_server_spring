package com.example.demo1.security;

import com.example.demo1.accounts.Account;
import com.example.demo1.accounts.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Account account = accountRepository.findByUsername(userName);
        if(account==null){
            throw new UsernameNotFoundException(userName);
        }
        return new UserDetailsImpl(account);
    }
}
