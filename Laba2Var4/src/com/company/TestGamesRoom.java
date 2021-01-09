package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestGamesRoom {

    private static List<GamesRoom> company;
    public static void main(String[] args) {
        company = new ArrayList<>();
        fillCompany(company);


       //сортировка по количеству игрушек
        Comparator<GamesRoom> gamesroomComparator = new Comparator<GamesRoom>() {
            @Override
            public int compare(GamesRoom o1, GamesRoom o2) {
                return Integer.compare(o2.getNumber(), o1.getNumber());
            }
        };

       //сортировка по типу игрушек
        Comparator<GamesRoom> gamesroomComparator1 = new Comparator<GamesRoom>() {
            @Override
            public int compare(GamesRoom o1, GamesRoom o2) {
                if ((o2.getToys() == Toys.SmallCar_and_Doll) && (o1.getToys() == Toys.MediumCar_and_Ball)) {
                    return -1;
                } else if ((o1.getToys() == Toys.SmallCar_and_Doll) && (o2.getToys() == Toys.MediumCar_and_Ball)) {
                    return 1;
                } else if ((o1.getToys() == Toys.SmallCar_and_Doll) && (o2.getToys() == Toys.SmallCar_and_Doll)) {
                    return 0;
                } else {
                    return 0;
                }
            }
        };

        Collections.shuffle(company);
        for (GamesRoom al : company) {
            System.out.println(al);
        }
        Collections.sort(company, gamesroomComparator);
        System.out.println();
        for (GamesRoom al : company) {
            System.out.println(al);
        }
        Collections.sort(company, gamesroomComparator1);
        System.out.println();
        for (GamesRoom al : company) {
            System.out.println(al);
        }
    }

    private static void fillCompany(List<GamesRoom> company) {
        company.add(new SmallGroup("Набор игрушек 1", 10, 25));
        company.add(new SmallGroup("Набор игрушек 2", 15, 30));
        company.add(new SmallGroup("Набор игрушек 3", 20, 30));
        company.add(new MediumGroup("Набор игрушек 4", 20, 35));
        company.add(new MediumGroup("Набор игрушек 5", 30, 55));
        company.add(new MediumGroup("Набор игрушек 6", 40, 65));
        company.add(new OlderGroup("Набор игрушек 7", 50, 70));
        company.add(new OlderGroup("Набор игрушек 8", 80, 100));
        company.add(new OlderGroup("Набор игрушек 9", 90, 120));
    }
}
