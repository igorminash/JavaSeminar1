package org.example.homework5.hw2;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение,
 * где искомое слово будет являться ключом), вносить все слова не нужно.
 */
public class Ex2 {
    public static void main(String[] args) {
        Map<String, Integer> mapCh = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase();
        String[] arr = str.split(" ");
        String searchWord = "Россия".toLowerCase();
        for (String s : arr) {
            String s2 = s.replaceAll("[^А-Яа-яЁё]", "");
            if (!mapCh.containsKey(s2)) {
                mapCh.putIfAbsent(s2, 1);
            } else {
                mapCh.put(s2, mapCh.get(s2) + 1);
            }
        }
            System.out.println(searchWord + " встретился " + mapCh.get(searchWord) + "раз");
    }
}
