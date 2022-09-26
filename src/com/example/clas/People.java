package com.example.clas;
import com.example.interfac.Copyable;
public class People implements Copyable {
    public String name;

    public People copy() {
        People people = new People();
        return people;
    }
    public void setName(String name) {
        this.name = name;
    }
}
