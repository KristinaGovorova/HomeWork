package ru.tele2.govorova.java.basic.homeworks.homework17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonDataBase {
    private final Map<Long, Person> personList;
    private static final Set<Position> managerPositions = new HashSet<>();
    static {
        managerPositions.add(Position.MANAGER);
        managerPositions.add(Position.DIRECTOR);
        managerPositions.add(Position.BRANCH_DIRECTOR);
        managerPositions.add(Position.SENIOR_MANAGER);
    }

    public PersonDataBase() {
        personList = new HashMap<>();
    }

    public Person findById(Long id) {
        return personList.get(id);
    }

    public void add(Person person) {
        personList.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        return managerPositions.contains(person.getPosition());
    }

    public boolean isEmployee(Long id) {
        return(!isManager(personList.get(id)));
    }
}
