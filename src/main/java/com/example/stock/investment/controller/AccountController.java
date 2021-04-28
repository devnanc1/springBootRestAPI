package com.example.stock.investment.controller;

import com.example.stock.investment.model.Account;
import com.example.stock.investment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("api/v1/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

        @GetMapping
        public ResponseEntity<List<Account>> getAccountList(){
            return ResponseEntity.ok().body(accountService.getAccountList());
        }
}
