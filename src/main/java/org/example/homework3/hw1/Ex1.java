package org.example.homework3.hw1;

import org.example.homework3.hw1.model.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Ex1 {
    public static void main(String[] args) {
        Items items1 = new Items("Высший сорт муки", 100, 1);
        Items items2 = new Items("Хлеб", 50, 2);
        Items items3 = new Items("Высший сорт клубники", 200, 2);
        Items items4 = new Items("Молоко", 250, 3);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);


        int maxPrice = 0;

        for (Items items : itemsList) {
            if (items.getName().contains("Высший") && items.getSort() == 1 || items.getSort() == 2) {
                if (maxPrice <= items.getPrice()) {
                    maxPrice = items.getPrice();
                }
            }
        }
        System.out.println(maxPrice);
    }
}
