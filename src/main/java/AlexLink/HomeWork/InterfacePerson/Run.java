package AlexLink.HomeWork.InterfacePerson;

import AlexLink.HomeWork.InterfacePerson.Jacket.JacketOne;
import AlexLink.HomeWork.InterfacePerson.Jacket.JacketTwo;
import AlexLink.HomeWork.InterfacePerson.Pants.PantsOne;
import AlexLink.HomeWork.InterfacePerson.Pants.PantsTwo;
import AlexLink.HomeWork.InterfacePerson.Shoes.ShoesOne;
import AlexLink.HomeWork.InterfacePerson.Shoes.ShoesTwo;

////2)
////По аналогии с первым задание делаем след. задание.
////Интерфейсы:
////- Куртка
////- Штаны
////- Обувь
////в каждом интерфейсе есть 2 метода (надеть и снять)
////Делаем несколько реализации каждого интерфейса.
////Создаём класс человек:
////У человека поля:
////-имя
////-куртка
////-штаны
////-обувь
////У человека есть 2 метода:
////- одеться(вызываются методы надетьдеть у всех вещей)
////- раздеться (вызываются методы снять у всех вещей)

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
