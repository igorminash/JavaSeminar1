package org.example.homework1.hw1;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();
        String  str2 = str.trim();
        String [] words = str2.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.printf(words[i] + " ");
        }
    }
}
