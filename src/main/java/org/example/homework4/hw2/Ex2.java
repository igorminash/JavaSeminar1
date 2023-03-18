package org.example.homework4.hw2;


import java.util.Deque;
import java.util.LinkedList;

public class Ex2 {
    public static void main(String[] args) {
        String text1 = "()";
        String text2 = "()[]{}";
        String text3 = "(]";

        System.out.println("1 = " + simplifyPath(text1));
        System.out.println("2 = " + simplifyPath(text2));
        System.out.println("3 = " + simplifyPath(text3));
    }

    /**
     * @param path входная строка
     * @return соответствие условию или нет
     */
    private static boolean simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("");
        for (String s : arr) {
            if (s.contains("(") || s.contains("[") || s.contains("{")) {
                list.add(s);
            } else if (list.isEmpty()) return false;
            else if (s.equals(")") && !list.pop().equals("(")) return false;
            else if (s.equals("]") && !list.pop().equals("[")) return false;
            else if (s.equals("}") && !list.pop().equals("{")) return false;
        }
        return list.isEmpty();
    }
}

