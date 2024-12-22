package com.example.dop_zadanie2;

// Абстрактный класс Human
public abstract class Human {
    // Поле для хранения возраста человека
    protected int age;

    // Геттер для получения возраста
    // Этот метод позволяет получить значение возраста
    public int getAge() {
        return age;
    }

    // Сеттер для установки возраста
    // Этот метод позволяет задать возраст человека
    public void setAge(int age) {
        this.age = age;
    }

    // Абстрактный метод для вывода информации о человеке
    // Этот метод должен быть реализован в подклассах для конкретного вывода информации
    public abstract void displayInfo();
}
