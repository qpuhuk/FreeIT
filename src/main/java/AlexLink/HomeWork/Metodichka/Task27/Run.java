package AlexLink.HomeWork.Metodichka.Task27;

//Задание 26
//Создать иерархию классов, описывающих бытовую технику. Создать несколько
//объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Appliances> appliances = new ArrayList<>();
        appliances.add(new GasStove("Philips", "Big", 2, 4));
        appliances.add(new Teapot("Sony","Small", 220,true));
        appliances.add(new Fridge("Siemens","Big",220,4));
        appliances.forEach(Appliances::turnOn);
    }
}
