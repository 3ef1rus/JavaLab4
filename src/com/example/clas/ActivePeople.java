package com.example.clas;

import com.example.interfac.Facade;

public class ActivePeople extends People implements Facade {

    public ActivePeople(String name) {
        super(name);
    }
    public void start(){
        System.out.println("����� ����");
    }
    public void stop(){
        System.out.println("�����������");
    }
}
    

