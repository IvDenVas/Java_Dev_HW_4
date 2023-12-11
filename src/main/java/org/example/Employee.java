package org.example;

public class Employee {
    private final int id;
    private final String name;
    private final String phoneNum;
    private final int experience;

    public Employee(int id, String name, String phoneNum, int experience) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + phoneNum + " " + experience;
    }
}
