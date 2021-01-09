package com.company;


public class OlderGroup extends GamesRoom{
    private int price;
    private Toys toys;

    public OlderGroup(String model, int price, int number) {
        this.price= price;
        this.toys = Toys.BigCar_and_Cubes;
        super.setNumber(number);
    }

    @Override
    public String toString() {
        return "OlderGroup{ " + "Number =" + super.getNumber() + ", price =" + price + ", toys =" + toys + " }";
    }
}