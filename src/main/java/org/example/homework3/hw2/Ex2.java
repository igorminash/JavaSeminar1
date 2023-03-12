package org.example.homework3.hw2;

import org.example.homework3.hw2.model.Goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {
        Goods goods1 = new Goods("Мука", "Беларусь", 5, 10, 1);
        Goods goods2 = new Goods("Яблоко", "Польша", 1, 12, 2);
        Goods goods3 = new Goods("Ананас", "Бразилия", 2, 8, 3);
        Goods goods4 = new Goods("Золотой ключик", "Россия", 12, 20, 1);
        Goods goods5 = new Goods("Фарш", "Беларусь", 10, 10, 1);

        List<Goods> goodsList = new ArrayList<>();

        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
        goodsList.add(goods5);

        Scanner scanner = new Scanner(System.in);
        int searchSort = scanner.nextInt();

        List<String> goodsName = new ArrayList<>();

        int minPrice = goods1.getPrice();

        for (Goods goods : goodsList) {
            if (goods.getPrice() < minPrice && goods.getSort().equals(searchSort)) {
                minPrice = goods.getPrice();
            }
        }
        for (Goods goods : goodsList) {
            if (goods.getSort().equals(searchSort) && goods.getPrice() == minPrice) {
                goodsName.add(goods.getName());
            }
        }

        System.out.println("Наименование товара : " + goodsName);
        System.out.println("Минимальная стоимость : " + minPrice + "руб.");
    }
}
