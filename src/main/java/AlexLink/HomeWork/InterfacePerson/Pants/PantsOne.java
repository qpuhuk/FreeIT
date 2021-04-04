package AlexLink.HomeWork.InterfacePerson.Pants;

public class PantsOne implements Pants{
    @Override
    public void putItOn() {
        System.out.println(" надевает штаны фирмы \"Я достаю из широких штанин\"");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает штаны фирмы \"Я достаю из широких штанин\"");
    }
}
