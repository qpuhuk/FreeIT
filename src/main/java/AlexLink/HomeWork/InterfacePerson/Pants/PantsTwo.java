package AlexLink.HomeWork.InterfacePerson.Pants;

public class PantsTwo implements Pants{

    @Override
    public void putItOn() {
        System.out.println(" надевает штаны фирмы \"Коммунар очка\"");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает штаны фирмы \"Коммунар очка\"");
    }
}
