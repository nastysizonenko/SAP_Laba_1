package com.company;

import com.company.model.Toy;
import java.util.Comparator;

public class SortByCost implements Comparator<Toy> { //сортировка по стоимости
    public int compare(Toy o1, Toy o2) {

        return ((Double) o1.getCost()).compareTo(o2.getCost());
    }
}
