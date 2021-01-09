package com.company;


public class MediumGroup extends GamesRoom{
    private int price;
    private Toys toys;

    public MediumGroup(String model, int price, int number) {
        this.price= price;
        this.toys = Toys.MediumCar_and_Ball;
        super.setNumber(number);
    }

    @Override
    public String toString() {
        return "MediumGroup{ " + "Number =" + super.getNumber() + ", price =" + price + ", toys =" + toys + " }";
    }
}