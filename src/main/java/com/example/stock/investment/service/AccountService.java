package com.example.stock.investment.service;
import com.example.stock.investment.model.Account;
import com.example.stock.investment.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAccountList(){
        return accountRepository.findAll();
    }

    public Account getAccountById(long accountId){
        if(accountRepository.findById(accountId).isPresent())
            return accountRepository.findById(accountId).get();
        else
            throw new IllegalStateException("Account " + accountId + " does not exist");
    }
}
