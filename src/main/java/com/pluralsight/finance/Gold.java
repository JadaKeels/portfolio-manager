package com.pluralsight.finance;

public class Gold {

    public class Gold extends FixedAsset {
        private double weight;
        public Gold(String name, double weight) {
            super(name);
            this.weight = weight;

        }
        @Override
        public BigDecimal getValue() {
            return BigDecimal.valueOf(weight * 1900);
        }
    }
