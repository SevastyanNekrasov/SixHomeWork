package com.msaggik.seventhlessonflight;

public class Minivan extends Automobile {

    // поля сущности
    private String name; // название
    private final int speed = 180; // скорость
    private final int weight = 1600; // высота подъёма
    private final int capacity = 8; // вместимость

    public Minivan(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }
    public String transportation(){
        return("Я везу 8 человек!");
    }
}

// конструктор
