package com.example.dop_zadanie2;

import android.util.Log;

// Класс Car реализует интерфейс Driveable
public class Car implements Driveable {

    // Поля класса, которые будут хранить информацию о марке, модели и году выпуска машины
    private String make;   // Марка машины (например, Toyota)
    private String model;  // Модель машины (например, Camry)
    private int year;      // Год выпуска машины (например, 2023)

    // Конструктор класса для инициализации полей
    public Car(String make, String model, int year) {
        this.make = make;       // Инициализация марки машины
        this.model = model;     // Инициализация модели машины
        this.year = year;       // Инициализация года выпуска машины
    }

    // Геттер для марки машины
    public String getMake() {
        return make;  // Возвращает марку машины
    }

    // Сеттер для марки машины
    public void setMake(String make) {
        this.make = make;  // Устанавливает новую марку машины
    }

    // Геттер для модели машины
    public String getModel() {
        return model;  // Возвращает модель машины
    }

    // Сеттер для модели машины
    public void setModel(String model) {
        this.model = model;  // Устанавливает новую модель машины
    }

    // Геттер для года выпуска машины
    public int getYear() {
        return year;  // Возвращает год выпуска машины
    }

    // Сеттер для года выпуска машины
    public void setYear(int year) {
        this.year = year;  // Устанавливает новый год выпуска машины
    }

    // Переопределение метода go() из интерфейса Driveable
    @Override
    public void go() {
        // Логируем информацию о том, что машина едет
        Log.d("CarInfo", "Машина " + make + " " + model + " едет!");
    }
}
