package ru.tele2.govorova.java.basic.homeworks.homework26;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> items;

    public Box(T... items) {
        this.items = new ArrayList<T>(Arrays.asList(items));
    }

    public void add(T... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public void remove(T... items) {
        for (T item : items) this.items.remove(item);
    }

    public ArrayList<T> getItems() {
        return new ArrayList<T>(items);
    }

    public void clear() {
        items.clear();
    }

    public int getWeight() {
        if (items.size() == 0) return 0;
        int weight = 0;
        for (T item : items) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super T> box) {
        if (box == null) {
            System.out.println("Коробка, в которую вы хотите переложить фрукты, не существует");
            return;
        }
        if (this.equals(box)) {
            System.out.println("Нельзя переложить фрукты в ту же коробку");
            return;
        }


        box.items.addAll(this.items);
        clear();
    }
}
