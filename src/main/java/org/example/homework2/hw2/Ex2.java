package org.example.homework2.hw2;


import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(UpperNumber(N));
    }

    /**
     * @param N Последовательность чисел
     * @return Возрастающая ли последовательность
     */

    public static boolean UpperNumber(int N) {
        Scanner scanner = new Scanner(System.in);
        int FirstNum = scanner.nextInt();
        int SecondNum;
        for (int i = 1; i < N; i++) {
            SecondNum = scanner.nextInt();
            if (SecondNum <= FirstNum) {
                return false;
            }
            FirstNum = SecondNum;
        }
        return true;
    }
}
