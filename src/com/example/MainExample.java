package com.example;

import com.example.clas.People;
public class MainExample {

    public static void main(String[] args) {
        People prototype = new People();
            People clone = prototype.copy();
            clone.setName("ivan");
       
System.out.println(prototype);
System.out.println(clone);
    }
}
