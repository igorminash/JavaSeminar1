package org.example.homework5.hw1;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 * Россия идет вперед всей планеты. Планета — это не Россия.
 */
public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> mapCh = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase();
        String[] arr = str.split(" ");
        for (String s : arr) {
            String s2 = s.replaceAll("[^А-Яа-яЁё]", "");
            if (!mapCh.containsKey(s2)) {
                mapCh.putIfAbsent(s2, 1);
            } else {
                mapCh.put(s2, mapCh.get(s2) + 1);
            }
        }
        for (var entry : mapCh.entrySet()) {
            System.out.println(entry.getKey() + " встретился " + entry.getValue() + "раз");
        }
    }
}
