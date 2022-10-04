package com.example;

import com.example.clas.ActivePeople;
import com.example.clas.People;

public class MainExample {

    public static void main(String[] args) {
        People boy = new People("vasia");
        People girl = boy.copy();
        girl.setName("anna");
ActivePeople Woman = new ActivePeople("Tanya");
Woman.start();
Woman.stop();
        System.out.println(boy.name);
        System.out.println(girl.name);
    }
}
