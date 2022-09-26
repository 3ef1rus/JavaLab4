package com.example;

import com.example.clas.Figures;
import com.example.clas.Voluminous;
public class MainExample {

    private static void printFigure(Figures emp) {
        System.out.println("Figure name: " + emp.getName());
        System.out.println("Figure number corners: " + emp.getNumCorners());
    }
    public static void main(String[] args) {
        Figures square = new Figures("triugl",10);
        Voluminous cube = new Voluminous("cube",8,10);
        printFigure(square);
        printFigure(cube);
    }
}
