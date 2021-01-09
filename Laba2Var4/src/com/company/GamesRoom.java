package com.company;

public class GamesRoom {
    private int number; //количество игрушек
    private Toys toys; //тип игрушек

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Toys getToys() {
        return toys;
    }

    public void setToys(Toys toys) {
        this.toys = toys;
    }
}
