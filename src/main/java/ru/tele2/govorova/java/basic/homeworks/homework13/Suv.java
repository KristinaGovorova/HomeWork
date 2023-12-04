package ru.tele2.govorova.java.basic.homeworks.homework13;

public class Suv implements Transport {

    private int energy;
    private int full;

    public Suv(int energy, int full) {

        this.energy = energy;
        this.full = full;
    }

    @Override
    public boolean movement(int distance, Terrain terrain, Human whoRides) {
        if (energy * distance <= full) {
            full -= energy * distance;
            System.out.println(whoRides.getName() + " проехал " + distance + "км на вездеходе\nТеперь осталось " +
                    full + "л бензина\n");
            return true;
        }
        System.out.println(whoRides.getName() + " не смог проехать " + distance
                + "км на вездеходе, потому что не хватило бензина\n");
        return false;
    }
}