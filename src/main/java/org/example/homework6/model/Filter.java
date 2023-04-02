package org.example.homework6.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Filter extends Notebook {
    /**
     * Создание словаря с критериями фильтрации.
     * @return Словарь с критериями фильтрации.
     */
    public static HashMap<Integer, String> getSort() {
        HashMap<Integer, String> filterMap = new HashMap<>();
        filterMap.put(1, "ОЗУ");
        filterMap.put(2, "Объем ЖД");
        filterMap.put(3, "Операционная система");
        filterMap.put(4, "Цвет");

        return filterMap;
    }

    /**
     * Первичная фильтрация по выбраному критерию.
     * @param filterMap словарь критериев.
     * @param sc ввод критерия.
     * @return необходимый критерий.
     */
    public static int filterFirst(HashMap<Integer, String> filterMap, Scanner sc) {
        System.out.println("Выберите цифру, соответствующую необходимому критерию:");

        for (var el: filterMap.entrySet()) System.out.println(el.getKey() + ". " + el.getValue());

        System.out.print("\nВаш выбор: ");
        int choice = sc.nextInt();
        sc.nextLine();

        return choice;
    }

    /**
     * Метод создания словаря с цветами и ОС.
     * @param filterMap словарь критериев.
     * @param catalog каталог ноутбуков.
     * @return словарь цветов и операционных систем.
     */
    public static HashMap<String, ArrayList<String>> getChoices(HashMap<Integer, String> filterMap, ArrayList<Notebook> catalog) {
        HashMap<String, ArrayList<String>> osColorMap = new HashMap<>();

        HashSet<String> oc = new HashSet<>();
        HashSet<String> colors = new HashSet<>();
        ArrayList<String> osList = new ArrayList<>();
        ArrayList<String> colorList = new ArrayList<>();

        for (Notebook el: catalog) {
            oc.add(el.os);
            colors.add(el.color);
        }

        osList.addAll(oc);
        colorList.addAll(colors);

        osColorMap.put(filterMap.get(3), osList);
        osColorMap.put(filterMap.get(4), colorList);

        return osColorMap;
    }

    /**
     * Метод вторичной фильтрации.
     * @param filterMap словарь критериев.
     * @param catalog каталог ноутбуков.
     * @param osColorMap словарь цветов и ОС.
     * @param sc Ввод необходимой памяти.
     * @param firstChoice первый выбор критерия.
     * @return значение выбранного критерия.
     */
    public static int filterSecond(HashMap<Integer, String> filterMap, ArrayList<Notebook> catalog, HashMap<String, ArrayList<String>> osColorMap, Scanner sc, int firstChoice) {
        int choice = -1;

        if (firstChoice > 0 && firstChoice < 3) {
            System.out.println("Напишите минимально подходящее кол-во памяти (" + filterMap.get(firstChoice) + ").");
            System.out.print("Кол-во памяти (ГБ): ");

            choice = sc.nextInt();
            sc.nextLine();
        }

        else if (firstChoice > 2 && firstChoice < 5) {
            ArrayList<String> strChoices = osColorMap.get(filterMap.get(firstChoice));
            System.out.println("Выберите один из подходящих вариантов (" + filterMap.get(firstChoice) + "):");

            for (int i = 0; i < strChoices.size(); i++) {
                System.out.println((i + 1) + ". " + strChoices.get(i));
            }

            System.out.print("\nВаш выбор: ");
            choice = sc.nextInt();
            sc.nextLine();
        }

        else {
            System.out.println("Такого выбора нет!");
        }

        return choice;
    }

    /**
     * Метод фильтрации по выбраным критериям и вывод результата.
     * @param first первый критерий.
     * @param second второй критерий.
     * @param osColorMap словарь цветов и ОС.
     * @param catalog каталог ноутбуков.
     */
    public static void filterFinal(int first, int second, HashMap<String, ArrayList<String>> osColorMap, ArrayList<Notebook> catalog) {
        ArrayList<Notebook> matching = new ArrayList<>();

        switch (first) {
            case 1:
                for (Notebook el: catalog)
                    if (el.ozy >= second)
                        matching.add(el);
                break;

            case 2:
                for (Notebook el: catalog)
                    if (el.hardDisk >= second)
                        matching.add(el);
                break;

            case 3:
                if (osColorMap.get("Операционная система").size() <= second - 1 || second < 1) {
                    System.out.println("Такого выбора нет!");
                    break;
                }

                for (Notebook el: catalog)
                    if (osColorMap.get("Операционная система").get(second - 1).equals(el.os))
                        matching.add(el);
                break;

            case 4:
                if (osColorMap.get("Цвет").size() <= second - 1 || second < 1) {
                    System.out.println("Такого выбора нет!");
                    break;
                }

                for (Notebook el: catalog)
                    if (osColorMap.get("Цвет").get(second - 1).equals(el.color))
                        matching.add(el);
                break;

            default:
                break;
        }

        if (matching.size() < 1) System.out.println("Нет подходящих вариантов(");
        else {
            System.out.println("\n---- Все подходящие варианты ----\n");
            for (Notebook el: matching) el.getInfo();
            System.out.println("\n---------------------------------\n");
        }
    }

}