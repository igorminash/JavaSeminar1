package org.example.homework4.hw1;

import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> someList = new LinkedList<>();
        for (int i = 1; i < 5; i++) {
            someList.add(i);
        }
        System.out.println(someList);
        System.out.println(reverseList(someList));
    }

    /**
     * @param someList исходный список.
     * @return перевернутый список.
     */
    private static LinkedList<Integer> reverseList(LinkedList<Integer> someList) {
        LinkedList<Integer> resultList = new LinkedList<>();
        while (someList.size() > 0) {
            resultList.addFirst(someList.pop());
        }
        return resultList;
    }
}
