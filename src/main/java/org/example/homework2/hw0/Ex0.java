package org.example.homework2.hw0;

import org.example.homework2.hw0.model.Vector;

public class Ex0 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("длина вектора = " + vector1.lengthVector());
        System.out.println(("скалярное произведение = " + vector1.scalarMulti(vector2)));
        System.out.println("вектороное произведение = " + vector1.vectorMulti(vector2));
        System.out.println("косинус угла = " + vector1.vectorCos(vector2));
        System.out.println("сумма : " + vector1.vectorSum(vector2));
        System.out.println(("разность : " + vector1.vectorDiff(vector2)));
    }
}
