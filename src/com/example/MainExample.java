package com.example;

import com.example.clas.ComplicatedObject;
public class MainExample {

    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
            ComplicatedObject clone = prototype.copy();
            clone.setType(ComplicatedObject.Type.ONE);
       

    }
}
