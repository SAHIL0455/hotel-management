package com.bridgelabz;

public class Hotel {
    String name;
    int rates;

    public Hotel() {
    }

    public Hotel(String name, int rates) {
        this.name = name;
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rates=" + rates +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }
}
