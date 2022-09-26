package com.example.interfac;

public interface Car {
    void start();
    void stop();
}
class Key implements Car {
    public void start() {
        System.out.println("�������� �����");
    }
    public void stop() {
        System.out.println("�������� �����");
    }
}
class Engine implements Car {
    public void start() {
        System.out.println("��������� ���������");
    }
    public void stop() {
        System.out.println("���������� ���������");
    }
}
class Facade {
    private Key key;
    private Engine engine;
    public Facade() {
        key = new Key();
        engine = new Engine();
    }
    public void startCar() {
        key.start();
        engine.start();
    }
    public void stoptCar() {
        key.stop();
        engine.stop();
    }
}

/*public class FacadeTest {//����
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startCar();
        System.out.println();
        facade.stoptCar();
    }
}*/
