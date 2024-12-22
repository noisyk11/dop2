// Women.java
package com.example.dop_zadanie2;

import android.util.Log;  // Импортируем класс Log для вывода информации в Logcat

// Класс Women наследуется от абстрактного класса Human
// Это класс, представляющий женщину, и реализует метод displayInfo()
public class Women extends Human {

    // Переопределяем метод displayInfo() из абстрактного класса Human
    // Этот метод выводит информацию о возрасте женщины в Logcat
    @Override
    public void displayInfo() {
        // Используем Log.d() для вывода отладочной информации в Logcat
        // Формируем строку: "Это женщина, ей <возраст> лет"
        Log.d("HumanInfo", "Это женщина, ей " + age +" лет");
    }
}
