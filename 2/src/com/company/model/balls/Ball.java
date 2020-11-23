package com.company.model.balls;

import com.company.model.Toy;

public class Ball extends Toy { //класс мяч

    public Ball() {
        this("Мячи");
    }

    public Ball(String name) {
        super(name);
    }
}
