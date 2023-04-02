package org.example.homework6.model;

public class Notebook {
    String model;
    Integer ozy;
    Integer hardDisk;
    String os;
    String color;

    public Notebook(String model, Integer ozy, Integer hardDisk, String os, String color) {
        this.model = model;
        this.ozy = ozy;
        this.hardDisk = hardDisk;
        this.os = os;
        this.color = color;
    }

    public void getInfo() {
        System.out.println(this.model + ":\n\tЦвет: " + this.color + "\n\tОЗУ: " + this.ozy + "\n\tОбъем ЖД: " + this.hardDisk + "\n\tОперационная система: " + this.os + "\n");
    }

    public String getModel() {
        return model;
    }

    public Integer getOzy() {
        return ozy;
    }

    public Integer getHardDisk() {
        return hardDisk;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + this.model + ", color=" + this.color + ", ozy=" + this.ozy + ", hardDisk = " + this.hardDisk + ", os=" + this.os + "]";
    }

    public Notebook() {
        this.model = null;
        this.color = null;
        this.ozy = 0;
        this.hardDisk = 0;
        this.os = null;
    }
}
