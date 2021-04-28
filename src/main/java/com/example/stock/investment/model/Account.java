package com.example.stock.investment.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    @Column
    private String accountName;
    @Column
    private Currency currency;
    @ManyToMany(mappedBy = "accountList", fetch = FetchType.LAZY)
    private List<User> userList;

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public Account(){}

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public enum Currency{
        MX,
        CAD,
        USD
    }
}
