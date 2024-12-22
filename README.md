# Приложение для работы с интерфейсами и абстрактными классами

## Описание

Данное приложение демонстрирует использование интерфейсов и абстрактных классов на примере задачи, связанной с автомобилями и людьми (мужчинами и женщинами). В рамках проекта реализованы следующие компоненты:

- **Интерфейс `Driveable`** с методом `go()`, который реализуется в классе `Car`.
- **Абстрактный класс `Human`**, от которого наследуются классы `Women` и `Men`.
- Классы `Car`, `Women`, и `Men` с полями, конструкторами, геттерами и сеттерами.
- Ввод и вывод возраста женщины и мужчины с помощью геттеров и сеттеров.

## Функциональные возможности

1. **Интерфейс `Driveable`**:
    - Содержит метод `go()`, который реализует возможность запуска машины.
    - Класс `Car` имплементирует этот интерфейс и реализует метод `go()`, выводя сообщение о движении машины в Logcat.

2. **Абстрактный класс `Human`**:
    - Содержит защищённое поле `age`, которое хранит возраст человека.
    - Класс предоставляет геттеры и сеттеры для работы с возрастом.
    - Классы `Women` и `Men` наследуют `Human` и реализуют абстрактный метод `displayInfo()`, который выводит информацию о человеке в Logcat.

3. **Классы `Women` и `Men`**:
    - Классы наследуют абстрактный класс `Human` и переопределяют метод `displayInfo()`, чтобы выводить информацию о возрасте женщины или мужчины.

## Структура проекта

### 1. **Car.java**

Класс `Car` реализует интерфейс `Driveable` и содержит информацию о марке, модели и году выпуска автомобиля. Он имеет конструктор для инициализации этих данных и геттеры/сеттеры для полей.

```java
public class Car implements Driveable {

    // Поля класса, которые будут хранить информацию о марке, модели и году выпуска машины
    private String make;   // Марка машины 
    private String model;  // Модель машины
    private int year;      // Год выпуска машины

    // Конструктор класса для инициализации полей
    public Car(String make, String model, int year) {
        // Инициализация
        this.make = make;       
        this.model = model;     
        this.year = year;       
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
```
### 2. **Human.java**

Абстрактный класс, содержащий общие свойства и методы для людей, включая поле `age` и абстрактный метод `displayInfo()`.

```java
public abstract class Human {
    // Поле для хранения возраста человека
    protected int age;

    // Геттер для получения возраста
    public int getAge() {
        return age;
    }

    // Сеттер для установки возраста
    public void setAge(int age) {
        this.age = age;
    }

    // Абстрактный метод для вывода информации о человеке
    public abstract void displayInfo();
}
```
### 3. **Women.java**

Класс `Women` наследует `Human` и реализует метод `displayInfo()`, выводящий информацию о возрасте женщины.

```java
public class Women extends Human {

    // Переопределяем метод displayInfo() из абстрактного класса Human
    @Override
    public void displayInfo() {
        Log.d("HumanInfo", "Это женщина, ей " + age +" лет");
    }
}
```
### 4. **Men.java**

Класс `Men` также наследует `Human` и переопределяет метод `displayInfo()`, выводящий информацию о возрасте мужчины.

```java
public class Men extends Human {

    // Переопределяем метод displayInfo() из класса Human
    @Override
    public void displayInfo() {
        Log.d("HumanInfo", "Это мужчина, ему " + age + " лет");
    }
}
```
### 5. **Driveable.java**

Интерфейс `Driveable` с одним методом `go()`, который реализуется в классе `Car`.

```java
public interface Driveable {

    void go();
}

```

### 6. **MainActivity.java**

Интерфейс `Driveable` с одним методом `go()`, который реализуется в классе `Car`.

```java
public class MainActivity extends AppCompatActivity {

    private TextView textViewOutput; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        textViewOutput.setText(output); // Отображаем в TextView
    }
}
