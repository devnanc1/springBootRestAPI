package com.example.stock.investment;

import com.example.stock.investment.model.Account;
import com.example.stock.investment.model.User;
import com.example.stock.investment.repository.AccountRepository;
import com.example.stock.investment.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UsersAccountsConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, AccountRepository accountRepository){
        return args -> {
            User walter_white = new User("Walter White");
            User jesse_pinkman = new User("Jesse Pinkman");
            User martina_garcia = new User("Martina Garcia");
            User hank_green = new User("Hank Green");
            User aadam_ali = new User("Aadam Ali");

            userRepository.saveAll(List.of(walter_white,jesse_pinkman,martina_garcia,hank_green,aadam_ali));

            Account account12358 = new Account("account12358");
            Account account12349 = new Account("account12349");
            Account account11351 = new Account("account11351");
            Account account02350 = new Account("account02350");
            Account account72846 = new Account("account72846");
            Account account10304 = new Account("account10304");

            accountRepository.saveAll(List.of(account12349,account11351,account02350,account10304,account72846,account12358));

        };
    }
}
