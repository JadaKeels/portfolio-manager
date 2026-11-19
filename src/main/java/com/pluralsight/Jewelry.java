package com.pluralsight;

public class Jewelry {
    public static interface House {

        public class House extends FixedAsset {
            private int yearBuilt;
            private int squareFeet;
            private int bedrooms;
            public House(String name, int yearBuilt, int squareFeet, int bedrooms) {
                super(name);
                this.yearBuilt = yearBuilt;
                this.squareFeet = squareFeet;
                this.bedrooms = bedrooms;
            }

            @Override
            public BigDecimal getValue() {
                return new BigDecimal("250000");
            }
        }
}
