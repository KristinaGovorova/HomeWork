package ru.tele2.govorova.java.basic.homeworks.homework13;


public class Human {
    public String name;
    public Transport currentTransport;
    public int consumption;
    public int energy;

    public Human(String name, int consumption, int energy) {
        this.name = name;
        this.currentTransport = null;
        this.consumption = consumption;
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }

    public int getConsumption() {
        return consumption;
    }


    public void changeTransport(Transport transport1) {
        this.currentTransport = transport1;
    }

    public void decrease(int distance) {
        energy -= distance * consumption;
    }

    public void getOff() {
        this.currentTransport = null;
        System.out.println(name + " теперь пешком\n");
    }

    public boolean walk(int distance) {
        if (consumption * distance <= energy) {
            decrease(distance);
            System.out.println(name + " прошел пешком " + distance + "км\n" + "Теперь энергия " + energy + "\n");
            return true;
        }
        System.out.println("У " + name + " недостаточно энергии" + "\n");
        return false;
    }

    public void doIt(Terrain terrain, int distance) {
        if (currentTransport == null) {
            walk(distance);
        } else {
            this.currentTransport.movement(distance, terrain, this);
            return;
        }
    }

}

