package com.msaggik.seventhlessonflight;

public abstract class Automobile implements Transport{

    private String name;
    int capacity;
    int weight;
    int speed;

    public Automobile(int capacity, int weight, int speed, String name) {
        this.capacity = capacity;
        this.weight = weight;
        this.speed = speed;
        this.name = name;
    }

    public Automobile(String name) {
    }

    public String transportation(){
        return("Я везу!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
