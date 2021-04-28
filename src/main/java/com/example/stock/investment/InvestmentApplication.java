package com.example.stock.investment;

import com.example.stock.investment.model.Account;
import com.example.stock.investment.model.User;
import com.example.stock.investment.repository.AccountRepository;
import com.example.stock.investment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class InvestmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentApplication.class, args);
	}
}
