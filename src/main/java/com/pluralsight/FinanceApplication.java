package com.pluralsight;

import com.pluralsight.finance.*;
import java.math.BigDecimal;

public class FinanceApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio(
                "Personal Portfolio",
                "Jada Keels"
        );
        portfolio.add(new House(
                "Primary Residence",
                1980,
                2100,
                4
        ));
        portfolio.add(new Gold(
                "Gold Bullion",
                22
        ));
        portfolio.add(new CreditCard(
                "Navy Federal",
                "5056-4300-9100-8190",
                new BigDecimal("18000.00")
        ));
        System.out.println("Portfolio Value: $" +
                portfolio.getValue());
        System.out.println("\nMost Valuable Asset:");
        Valuable mostValuable =
                portfolio.getMostValuable();
        System.out.println(
                mostValuable.getClass().getSimpleName()
                        + " : $" +
                        mostValuable.getValue());
        System.out.println("\nLeast Valuable Asset:");
        Valuable leastValuable =
                portfolio.getLeastValuable();
        System.out.println(
                leastValuable.getClass().getSimpleName()
                        + " : $" +
                        leastValuable.getValue());
    }
}