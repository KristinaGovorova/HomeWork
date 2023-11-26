package ru.tele2.govorova.java.basic.homeworks.homework13;

public class Homework13 {
    public static void main(String[] args) {

        //инициализация объектов
        Human Human1 = new Human("Владимир", 1, 12);

        Car Car1 = new Car(3, 90);
        Horse Horse1 = new Horse(30, 1);
        Bike Bike1 = new Bike();
        Suv Suv1 = new Suv(2, 300);


        Human1.changeTransport(Car1);
        Human1.doIt(Terrain.FOREST, 50);
        Human1.changeTransport(Car1);
        Human1.doIt(Terrain.PLAIN, 30);
        Human1.changeTransport(Horse1);
        Human1.doIt(Terrain.PLAIN, 27);
        Human1.changeTransport(Bike1);
        Human1.doIt(Terrain.FOREST, 6);
        Human1.getOff();
        Human1.doIt(Terrain.FOREST, 6);
        Human1.changeTransport(Suv1);
        Human1.doIt(Terrain.FOREST, 30);
        Human1.changeTransport(Suv1);
        Human1.doIt(Terrain.SWAMP, 100);
        Human1.changeTransport(Suv1);
        Human1.doIt(Terrain.SWAMP, 1000);

    }
}
