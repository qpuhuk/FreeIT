package AlexLink.HomeWork.Exception;

//1) Создать собственное исключение
//- Создать класс Car c полями (марка, скорость, цена), конструкторы (с
//параметрами и default) гетеры-сетеры.
//Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
//генерируете случайное число от 0 до 20, если полученное число оказалось
//четным, то выбрасываете созданное ранее вами исключение и передаете его к
//месту откуда вызывали метод старт. Если все хорошо и исключение не
//вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
//завелся.
//В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете
//исключение которое может вылететь при старте автомобиля

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Audi", 300, 50000.00);
        Car car1 = new Car("BMW", 280, 70000.00);
        Car car2 = new Car("Chevrolet", 330, 100000.00);

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);

        cars.forEach(c -> {
            try {
                c.start();
            } catch (StartException e) {
                System.err.println("The " + c.getBrand() + " doesn't start ");
                e.printStackTrace();
            }
        });
    }
}
