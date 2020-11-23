package com.company;

import com.company.model.Toy;
import java.util.Comparator;

public class SortByName implements Comparator<Toy> { //сортировка по названию игрушки
    public int compare(Toy o1, Toy o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
