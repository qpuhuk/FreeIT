package AlexLink.HomeWork.HW7.City;

//8. Создать класс City с внутренним классом, с помощью объектов которого
//можно хранить информацию о проспектах, улицах, площадях.

public class Runner {
    public static void main(String[] args) {

        City city = new City("Брест");
        city.addStreetOrSquare(city.new Street("Пушкинская", 2));
        city.addStreetOrSquare(city.new Square("площадь Свободы", 5));
        city.getListStreetsAndSquares().forEach(System.out::println);
    }
}