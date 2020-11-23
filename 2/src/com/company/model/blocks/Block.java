package com.company.model.blocks;

import com.company.model.Toy;
public class Block extends Toy { //класс кубик

    public Block() {
        this("Кубики");
    } 

    public Block(String name) {
        super(name);
    }
}
