package com.company.model.cars;
import com.company.model.Toy;

public abstract class Car extends Toy { //класс машины
    public Car() {
        this("Car");
    }

    public Car(String name) {
        super(name);
    }
}
