package com.pluralsight.finance;

import com.pluralsight.FinanceApplication;

import java.math.BigDecimal;

public class FixedAsset {

    public abstract class FixedAsset implements FinanceApplication {
        private String name;
        public FixedAsset(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public abstract BigDecimal getValue();
    }