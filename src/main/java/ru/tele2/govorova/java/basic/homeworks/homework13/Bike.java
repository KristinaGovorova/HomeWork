package ru.tele2.govorova.java.basic.homeworks.homework13;

public class Bike implements Transport {

    @Override
    public boolean movement(int distance, Terrain terrain, Human whoRides) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Велосипед не сможет проехать по болоту\n");
            return false;
        }
        if ((whoRides.getConsumption() * distance) <= whoRides.getEnergy()) {
            whoRides.decrease(distance);
            System.out.println(whoRides.getName() + " проехал на велосипеде " + distance
                    + "км\n" + "Теперь энергия " + whoRides.getEnergy() + "\n");
            return true;
        }
        System.out.println(whoRides.getName() + " не смог проехать на велосипеде " + distance + "км\n");
        return false;
    }

}
