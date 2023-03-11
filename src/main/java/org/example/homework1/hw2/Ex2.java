package org.example.homework1.hw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int b = scanner.nextInt();
        while (b != 0) {
            int a = b;
            b = scanner.nextInt();
            if (b != 0) {
                if (a > 0 && b < 0) {
                    sum += a;
                }
            }
        }
        System.out.println(sum);
    }
}