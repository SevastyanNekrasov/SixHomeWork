package com.msaggik.seventhlessonflight;

public class Truck extends Automobile {

    // поля сущности
    private String name; // название
    private final int speed = 170; // скорость
    private final int weight = 3000; // высота подъёма
    private final int capacity = 3; // вместимость

    public Truck(String name) {
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
        return("Я везу груз!");
    }
}

// конструктор
