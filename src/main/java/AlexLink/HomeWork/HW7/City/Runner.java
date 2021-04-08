package AlexLink.HomeWork.HW7.City;

//8. Создать класс City с внутренним классом, с помощью объектов которого
//можно хранить информацию о проспектах, улицах, площадях.

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Title> titles = new ArrayList<>();
        City city = new City("Брест");

        titles.add(new City.Street("Пушкинская", 2));
        titles.add(city. new Square("площадь Свободы", 5));

        titles.forEach(s -> System.out.println(s.getTitle()));
    }
}