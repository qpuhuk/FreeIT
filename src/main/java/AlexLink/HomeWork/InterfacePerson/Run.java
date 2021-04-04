package AlexLink.HomeWork.InterfacePerson;

import AlexLink.HomeWork.InterfacePerson.Jacket.JacketOne;
import AlexLink.HomeWork.InterfacePerson.Jacket.JacketTwo;
import AlexLink.HomeWork.InterfacePerson.Pants.PantsOne;
import AlexLink.HomeWork.InterfacePerson.Pants.PantsTwo;
import AlexLink.HomeWork.InterfacePerson.Shoes.ShoesOne;
import AlexLink.HomeWork.InterfacePerson.Shoes.ShoesTwo;

public class Run {
    public static void main(String[] args) {

        Person person = new Person("Лапушенко", new ShoesOne(), new PantsOne(), new JacketOne());
        person.putItOn();
        person.takeOff();
        Person person1 = new Person("Колян", new ShoesTwo(), new PantsTwo(), new JacketTwo());
        person1.putItOn();
        person1.takeOff();


    }
}
