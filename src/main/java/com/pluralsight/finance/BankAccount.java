package com.pluralsight.finance;

import com.pluralsight.FinanceApplication;

import java.math.BigDecimal;

public class BankAccount {

    public class BankAccount implements FinanceApplication {
        private int accountNumber;
        private String owner;
        private BigDecimal balance;

        public BankAccount(int accountNumber, String owner, BigDecimal balance) {
            this.accountNumber = accountNumber;
            this.owner = owner;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance = balance.add(BigDecimal.valueOf(amount));
        }

        public void withdraw(double amount) {
            balance = balance.subtract(BigDecimal.valueOf(amount));
        }

        @Override
        public BigDecimal getValue() {
            return balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public String getOwner() {
            return owner;
        }

        public BigDecimal getBalance() {
            return balance;
        }
    }
}
