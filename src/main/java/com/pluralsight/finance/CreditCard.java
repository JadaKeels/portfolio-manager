package com.pluralsight.finance;

import java.math.BigDecimal;

public class CreditCard implements FinanceApplication {

    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public CreditCard(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void pay(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public BigDecimal getValue() {
        return balance.negate();
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}