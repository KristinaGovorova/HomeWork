package ru.tele2.govorova.java.basic.homeworks.homework13;

public class Horse implements Transport {

    private int energy;
    private int consumption;


    public Horse(int energy, int consumption) {

        this.energy = energy;
        this.consumption = consumption;
    }

    public boolean movement(int distance, Terrain terrain, Human whoRides) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Лошадь не сможет проехать по болоту\n");
            return false;
        }
        if (consumption * distance <= energy) {
            System.out.println(whoRides.name + " проехал " + distance + "км на лошади\n");
            energy -= consumption * distance;
            return true;
        }
        System.out.println(whoRides.name + " не смог проехать " + distance
                + "км, потому что лошади не хватило выносливости\n");
        return false;
    }
}

