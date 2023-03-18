package org.example.homework4.hw2;

import org.jetbrains.annotations.NotNull;

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

    private static boolean simplifyPath( String path) {
        Deque<String> list = new LinkedList<>();
        String [] arr = path.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("(") || arr[i].contains("[") || arr[i].contains("{")) {
                list.add(arr[i]);
            }
            else if (list.isEmpty()) return false;
            else if (arr[i].equals(")") && !list.pop().equals("(")) return false;
            else if (arr[i].equals("]") && !list.pop().equals("[")) return false;
            else if (arr[i].equals("}") && !list.pop().equals("{")) return false;
        }
        return list.isEmpty();
    }
}

