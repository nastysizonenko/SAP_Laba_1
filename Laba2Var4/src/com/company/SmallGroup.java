package com.company;

public class SmallGroup extends GamesRoom{
    private int price;
    private Toys toys;

    public SmallGroup(String model, int price, int number) {
        this.price= price;
        this.toys = Toys.SmallCar_and_Doll;
        super.setNumber(number);
    }

    @Override
    public String toString() {
        return "SmallGroup { " + "Number =" + super.getNumber() + ", price =" + price + ", toys =" + toys + " }";
    }
}