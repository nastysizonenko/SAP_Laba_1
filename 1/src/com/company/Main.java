package com.company;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        int avgM = 3;//средний бил

        List<com.company.Student> arrayStudents = new ArrayList<>();

        arrayStudents.add(new com.company.Student(1, "Турбинов", "Александр", "Викторович", "г.Симферополь", "67-86-43",
                new int[] { 5,4, 5, 5, 5 }));
        arrayStudents.add(new com.company.Student(2, "Зыкин", "Петр", "Алексеевич", "г.Судак", "98-12-45",
                new int[] { 3, 5, 5, 3, 5 }));
        arrayStudents.add(new com.company.Student(3, "Сизоненко", "Анастасия", "Александровна", "г.Феодосия", "23-45-23",
                new int[] {5, 4, 4, 4, 5 }));
        arrayStudents.add(new com.company.Student(4, "Смаилов", "Шевкет", "Нариманович", "г.Симферополь", "90-45-98",
                new int[] { 3, 2, 5, 3, 5 }));
        arrayStudents.add(new com.company.Student(5, "Хасанов", "Эрвин", "Шевкетович", "г.Феодосия", "89-32-12",
                new int[] { 5,5,5, 5, 5 }));


        System.out.println("-------------------------------------------------------- ");
        System.out.println("Список абитуриентов, имеющих неудовлетворительные оценки ");

        for (com.company.Student st : arrayStudents) {

            for (int i : st.getRating()) {
                if (i <= 3) {
                    st.printInfo();
                    break;
                }
            }
        }

        System.out.println("-------------------------------------------------------- ");
        System.out.println("Список абитуриентов, средний балл у которых выше заданного ");
        for (com.company.Student st : arrayStudents) {
            if (st.avg(st.getRating()) > avgM) {
                st.printInfo();
            }

        }

        System.out.println("-------------------------------------------------------- ");
        System.out.println("Список абитуриентов, у которых средний балл выше всех ");
        com.company.Student maxAVG;

        for (int j = 0; j < arrayStudents.size()-1; j++) {
            int tempJ = j + 1;
            if (arrayStudents.get(j).avg(arrayStudents.get(j).getRating()) < arrayStudents
                    .get(tempJ).avg(arrayStudents.get(tempJ).getRating())) {
                maxAVG=arrayStudents.get(tempJ);
                maxAVG.printInfo();



            }

        }

    }
}
