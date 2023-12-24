package com.msaggik.seventhlessonflight;

public class Car extends Automobile {

    // поля сущности
    private String name; // название
    private final int speed = 210; // скорость
    private final int weight = 1200; // высота подъёма
    private final int capacity = 5; // вместимость

    public Car(String name) {
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
        return("Я везу 5 человек!");
    }
}

// конструктор
