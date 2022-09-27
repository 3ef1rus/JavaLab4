package com.example;

import com.example.clas.People;

public class MainExample {

    public static void main(String[] args) {
        People boy = new People("vasia");
        People girl = boy.copy();
        girl.setName("anna");

        System.out.println(boy.name);
        System.out.println(girl.name);
        System.out.println(girl.name);
    }
}
