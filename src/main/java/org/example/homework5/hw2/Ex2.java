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
            if (!s2.equals(searchWord)) {
                continue;
            }
            int count = mapCh.getOrDefault(s2,0);
            mapCh.put(s2, ++count);
        }
        System.out.println(searchWord + " встретился " + mapCh.getOrDefault(searchWord,0) + "раз");
    }
}
