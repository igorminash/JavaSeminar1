package org.example.homework2.hw3;

import java.util.Arrays;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] inputArr = new int[]{1, -9, 12, -5, 16, -2, -15};
        PrintArray(inputArr);
        changeArray(inputArr);
        PrintArray(inputArr);
    }

    /**
     * @param inputArr Массив целых чисел
     */
    public static void changeArray(int[] inputArr) {
        int sum = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if ((inputArr[i] >= 10 && inputArr[i] <= 99) || (inputArr[i] >= -99 && inputArr[i] <= -10)) {
                sum += i;
            }
        }
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] < 0) {
                inputArr[i] = sum;
            }
        }
    }

    /**
     * @param inputArr первоначальный массив
     */
    public static void PrintArray(int[] inputArr) {
        int[] newArr = new int[inputArr.length];
        System.arraycopy(inputArr, 0, newArr, 0, inputArr.length);
        System.out.println(Arrays.toString(newArr));
    }
}

