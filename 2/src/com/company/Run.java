package com.company;

import com.company.controller.Controller;


public class Run {
    public static void main(String[] args) {
        Controller ctrl = new Controller(10, 150);//диапазон денежных средств
        ctrl.fillGameRoom(); //заполнение игровой комнаты
        System.out.println(ctrl.getOutput());
        ctrl.sortByCost();
        System.out.println(ctrl.getOutput());
        System.out.println(ctrl.findByCost(6, 10));
    }
}
