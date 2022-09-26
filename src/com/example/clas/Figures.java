package com.example.clas;

public class Figures {
    public int NumCorners;
    public String name;
    public int volume;

    public Figures(String name, int volume,int NumCorners) {
        this.NumCorners=NumCorners;
        this.name=name;
        this.volume=volume;
    }

    public int getNumCorners() {
        return NumCorners;
    }

    public int getvolume(){
        return volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
