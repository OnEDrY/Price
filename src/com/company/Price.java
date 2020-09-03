package com.company;

public class Price implements Priceble {
    private double price;

    public Price(double price) {
        this.price = price;
    }

    public Price()
    {

    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Price";
    }
}
