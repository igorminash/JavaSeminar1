package org.example.homework6;

import org.example.homework6.model.DataBase;
import org.example.homework6.model.Filter;
import org.example.homework6.model.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static org.example.homework6.model.DataBase.getLaptopList;
import static org.example.homework6.model.Filter.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Notebook> laptops = getLaptopList();
        HashMap<Integer, String> sortingValues = getSort();
        HashMap<String, ArrayList<String>> allStr = getChoices(sortingValues, laptops);
        Scanner sc = new Scanner(System.in);
        int firstChoice = filterFirst(sortingValues, sc);
        int secondChoice = filterSecond(sortingValues, laptops, allStr, sc, firstChoice);
        filterFinal(firstChoice, secondChoice, allStr, laptops);
        sc.close();
    }
}

