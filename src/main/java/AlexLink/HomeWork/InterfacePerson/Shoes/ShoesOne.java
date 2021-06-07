package AlexLink.HomeWork.InterfacePerson.Shoes;

public class ShoesOne implements Shoes{

    @Override
    public void putItOn() {
        System.out.println(" надевает обувь фирмы \"Мозоль-Боль\"");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает обувь фирмы \"Мозоль-Боль\"");
    }
}
