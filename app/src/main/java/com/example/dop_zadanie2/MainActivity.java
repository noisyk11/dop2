package com.example.dop_zadanie2;

// MainActivity.java
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewOutput; // Ссылка на TextView для вывода

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализируем TextView
        textViewOutput = findViewById(R.id.textViewOutput);
    }

    // Метод, который вызывается при нажатии на кнопку
    public void showInfo(View view) {
        // Создаем объект Car
        Car car = new Car("Toyota", "Camry", 2023);
        car.go(); // Вызов метода go() для машины

        // Создаем объект Women и устанавливаем возраст
        Women woman = new Women();
        woman.setAge(25); // Ввод возраста женщины
        woman.displayInfo(); // Вывод информации о женщине

        // Создаем объект Men и устанавливаем возраст
        Men man = new Men();
        man.setAge(30); // Ввод возраста мужчины
        man.displayInfo(); // Вывод информации о мужчине

        // Формируем строку для вывода, используя данные из объектов
        String output = "Машина " + car.getMake() + " " + car.getModel() + " едет!\n" +
                "Это женщина, ей " + woman.getAge() + " лет\n" +
                "Это мужчина, ему " + man.getAge() + " лет";

        // Обновляем TextView с полученной строкой
        textViewOutput.setText(output); // Отображаем в TextView
    }
}

