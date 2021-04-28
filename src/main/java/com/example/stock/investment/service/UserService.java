package com.example.stock.investment.service;

import com.example.stock.investment.model.Account;
import com.example.stock.investment.model.User;
import com.example.stock.investment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private AccountService accountService;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User getUserById(long userId) {
        if(userRepository.findById(userId).isPresent())
            return userRepository.findById(userId).get();
        else
            throw new IllegalStateException("User " + userId + " does not exist");
    }

    public User addAccountToUser(Long accountId, Long userId) {
        User user = getUserById(userId);
        if (user.getAccountList() != null)
            user.getAccountList().add(accountService.getAccountById(accountId));
        else
            user.setAccountList(List.of(accountService.getAccountById(accountId)));

        userRepository.save(user);

        return user;
    }

    public User deleteAccountFromUser(Long accountId, Long userId) {
        User user = getUserById(userId);
        if (user.getAccountList() != null)
            user.getAccountList().remove(accountService.getAccountById(accountId));

        userRepository.save(user);

        return user;
    }
}
