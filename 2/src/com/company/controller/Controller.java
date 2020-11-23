package com.company.controller;

import com.company.*;
import com.company.model.*;
import com.company.model.balls.Ball;
import com.company.model.blocks.Block;
import com.company.model.cars.*;
import com.company.model.dolls.Doll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private int maxToys;
    private double maxMoneys;
    private double money;
    private List<Toy> gameRoom;
    private ToysFabric toysFabric;
    private List<Toy> toys;
    private List<Class<? extends Toy>> tClasses =
            new ArrayList<Class<? extends Toy>>
                    (Arrays.asList(Doll.class, SmallCar.class,
                            MediumCar.class, LargeCar.class,
                            Ball.class, Block.class));

    private boolean addToyToGameRoom(Toy toy) {
        if (gameRoom.size() < maxToys && money
                + toy.getCost() <= maxMoneys) {
            gameRoom.add(toy);
            return true;
        } else return false;
    }

    private Toy getToy() {
        return toysFabric.getRandomToy();
    }


    private String getOutput(List<Toy> toys) {
        String result = "\nИгрушки:\n";
        for (Toy toy : toys) {
            result += toy.toString() + "\n";
        }
        result += getResult(toys);
        return result;
    }

    private String getResult(List<Toy> toys) {
        return "\nИспользованно денег: " + getTotalCost(toys) +
                " от общей суммы: " + maxMoneys +
                "\nИспользованные игрушки: " + toys.size() +
                " от общего количества: " + maxToys;
    }

    private double getTotalCost(List<Toy> toys) {
        double result = 0;
        for (Toy toy : toys) {
            result += toy.getCost();
        }
        return result;
    }

    public Controller(int maxToys, double maxMoneys) {
        Price price = new Price(tClasses);
        this.maxToys = maxToys;
        this.maxMoneys = maxMoneys;
        this.gameRoom = new ArrayList<Toy>();
        this.toys = new ArrayList<Toy>();
        this.toysFabric = new ToysFabric(tClasses);
    }

    public void fillGameRoom () {
        while(true) {
            Toy toy = getToy();
            if (!addToyToGameRoom(toy)) break;
            money += toy.getCost();
        }
    }

    public String getOutput() {

        return getOutput(gameRoom);
    }

    public String getResult() {

        return getResult(gameRoom);
    }

    public void sortByCost() {
        gameRoom.sort(new SortByCost());
    }

    public void sortByName() {
        gameRoom.sort(new SortByName());
    }

    public String findByCost(double startCost, double endCost) {
        toys.clear();
        for (Toy toy : gameRoom) {
            if (toy.getCost() >= startCost && toy.getCost() <= endCost) {
                toys.add(toy);
            }
        }
        return getOutput(toys);
    }

}