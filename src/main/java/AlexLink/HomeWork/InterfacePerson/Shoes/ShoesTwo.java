package AlexLink.HomeWork.InterfacePerson.Shoes;

public class ShoesTwo implements Shoes {

    @Override
    public void putItOn() {
        System.out.println(" надевает обувь фирмы \"Abroad-ская\"");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает обувь фирмы \"Abroad-ская\"");
    }
}

