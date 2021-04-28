package com.example.stock.investment.controller;

import com.example.stock.investment.model.User;
import com.example.stock.investment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/v1/user")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUserList(){
        return ResponseEntity.ok().body(userService.getUserList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        return  ResponseEntity.ok().body(userService.getUserById(id));
    }

    @PostMapping
    public User addAccountToUser(@RequestParam(value="accountId") Long accountId, @RequestParam(value="userId") Long userId){
        return userService.addAccountToUser(accountId, userId);
    }

    @DeleteMapping
    public User deleteAccountFromUser(@RequestParam(value="accountId") Long accountId, @RequestParam(value="userId") Long userId) {
        return userService.deleteAccountFromUser(accountId, userId);
    }
}
