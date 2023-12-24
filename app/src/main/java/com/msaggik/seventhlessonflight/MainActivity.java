package com.msaggik.seventhlessonflight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // поля
    private Car lada;
    private Truck gazel;
    private Minivan starex;// поля сущностей самолётов

    // создание дополнительных полей для вывода на экран полученных значений
    private TextView infoApp; // поле вывода информации анализа строки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // инициализация самолётов
        lada = new Car("Лада Веста");
        gazel = new Truck("Газель");
        starex = new Minivan("Хёнде Старекс");

        // привязка поля к разметке по id
        infoApp = findViewById(R.id.infoApp);

        // вывод информации на экран смартфона
        infoApp.setText("Лада Веста, легковой автомобиль с характеристиками:\n "
                + "- Вместительность: " + lada.getCapacity() + " пассажиров\n"
                + "- Масса автомобиля: " + lada.getWeight() + " кг\n"
                + "- Максимальная скорость: " + lada.getSpeed() + " км/ч\n"
                + lada.transportation() + "\n"
                + "Газель, грузовой автомобиль с характеристиками:\n "
                + "- Вместительность: " + gazel.getCapacity() + " пассажира\n"
                + "- Масса автомобиля: " + gazel.getWeight() + " кг\n"
                + "- Максимальная скорость: " + gazel.getSpeed() + " км/ч\n"
                + gazel.transportation() + "\n"
                +"Хёнде Старекс, минивен с характеристиками:\n "
                + "- Вместительность: " + starex.getCapacity() + " пассажиров\n"
                + "- Масса автомобиля: " + starex.getWeight() + " кг\n"
                + "- Максимальная скорость: " + starex.getSpeed() + " км/ч\n"
                + starex.transportation() + "\n"
                );
    }
}