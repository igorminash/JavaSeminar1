package org.example.homework2.hw1;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Сумма простых чисел =  " + GetSum(N));
    }

    /**
     * @param currentNum проверка на простоту
     * @return Простое число
     */
    public static boolean SimpleNum(int currentNum) {
        for (int i = 2; i <= Math.sqrt(currentNum); i++) {
            if (currentNum % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param N Находим длину простых чисел
     * @return Сумму простых чисел
     */
    public static int GetSum(int N) {
        Scanner scanner = new Scanner(System.in);
        int Sum = 0;
        for (int i = 0; i < N; i++) {
            int currentNum = scanner.nextInt();
            if (SimpleNum(currentNum) && currentNum != 1) {
                Sum += currentNum;
            }
        }
        return Sum;
    }
}