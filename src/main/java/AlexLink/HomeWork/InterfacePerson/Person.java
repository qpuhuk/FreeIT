package AlexLink.HomeWork.InterfacePerson;

import AlexLink.HomeWork.InterfacePerson.Jacket.Jacket;
import AlexLink.HomeWork.InterfacePerson.Pants.Pants;
import AlexLink.HomeWork.InterfacePerson.Shoes.Shoes;

public class Person {

    private final String name;
    private final Shoes shoes;
    private final Pants pants;
    private final Jacket jacket;

    public Person(String name, Shoes shoes, Pants pants, Jacket jacket) {
        this.name = name;
        this.shoes = shoes;
        this.pants = pants;
        this.jacket = jacket;
    }

    public void putItOn() {
        System.out.printf("Человек по имени \"%s\"", name);
        shoes.putItOn();
        pants.putItOn();
        jacket.putItOn();
    }

    public void takeOff() {
        System.out.printf("Человек по имени \"%s\"", name);
        shoes.takeOff();
        pants.takeOff();
        jacket.takeOff();
    }
}
