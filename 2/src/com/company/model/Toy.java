package com.company.model;

import com.company.Price;

public abstract class Toy { //класс игрушки
    private double cost;
    private String name;

    public Toy (String name) {
        this.cost = Price.getPrice(this.getClass());
        this.name = name;
    }

    @Override
    public String toString() {

        return "( " + name + " : " + cost + " )";
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
