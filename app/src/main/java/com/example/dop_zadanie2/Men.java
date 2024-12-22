package com.example.dop_zadanie2;

import android.util.Log;

// Класс Men наследует от абстрактного класса Human
public class Men extends Human {

    // Переопределяем метод displayInfo() из класса Human
    @Override
    public void displayInfo() {
        // Используем Log.d() для вывода информации о мужчине в Logcat
        // Тег "HumanInfo" помогает фильтровать логи
        Log.d("HumanInfo", "Это мужчина, ему " + age + " лет");
    }
}
