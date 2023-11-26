package ru.tele2.govorova.java.basic.homeworks.homework13;

public class Car implements Transport {

    private int consumption;
    private int full;

    public Car(int consumption, int full) {

        this.consumption = consumption;
        this.full = full;
    }

    @Override
    public boolean movement(int distance, Terrain terrain, Human whoRides) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Машина не сможет проехать по болоту\n");
            return false;
        }
        if (terrain == Terrain.FOREST) {
            System.out.println("Машина не сможет проехать в густом лесу\n");
            return false;
        }
        if (consumption * distance <= full) {
            full -= consumption * distance;
            System.out.println(whoRides.name + " проехал " + distance + "км на машине\nТеперь осталось " +
                    full + "л бензина\n");
            return true;
        }
        System.out.println(whoRides.name + " не смог проехать " + distance + "км на машине, потому что не хватило бензина\n");
        return false;
    }

}
