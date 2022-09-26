package com.example;

import com.example.clas.Figures;

public class MainExample {

    private static void printFigure(Figures emp) {
        System.out.println("Figure name: " + emp.getName());
        System.out.println("Figure number corners: " + emp.getNumCorners());
        System.out.println("Figure volume " + emp.getvolume());
    }
    public static void main(String[] args) {
        Figures square = new Figures("triugl",5,10);
        printFigure(square);
    }
}
