package com.example;

import com.example.clas.People;
public class MainExample {

    public static void main(String[] args) {
<<<<<<< HEAD
        People boy = new People("vasia");
            People girl = boy.copy();
            girl.setName("anna");
       
System.out.println(boy.name);
System.out.println(girl.name);
=======
        Figures square = new Figures("triugl",4);
        Voluminous cube = new Voluminous("cube",8,10);
        Flat triugle = new Flat("triugle",3,9);
        Spherical oval = new Spherical("oval", 0);
        printFigure(square);
        printFigure(cube);
        printFigure(triugle);
        printFigure(oval);
        printFigure(oval);
>>>>>>> 14d547d17a4d07b18b2a00830acff8b559e56a9e
    }
}
