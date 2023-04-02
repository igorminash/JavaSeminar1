package org.example.homework6.model;


import java.util.ArrayList;


public class DataBase extends Filter {

    /**
     * Создание списка ноутбуков.
     * @return список ноутбуков.
     */
    public static ArrayList<Notebook> getLaptopList() {
        ArrayList<Notebook> catalog = new ArrayList<>();
        Notebook model1 = new Notebook("Asus", 16, 512, "Win10", "White");
        Notebook model2 = new Notebook("Apple MacBook Air 13\"", 8, 256,"MacOS" , "Silver");
        Notebook model3 = new Notebook("Samsung", 2, 128, "Win8", "Black");
        Notebook model4 = new Notebook("HP", 16, 512, "Win10", "Grey");
        Notebook model5 = new Notebook("Acer", 16, 512, "Win10", "Black");

        catalog.add(model1);
        catalog.add(model2);
        catalog.add(model3);
        catalog.add(model4);
        catalog.add(model5);

        return catalog;
    }
}


