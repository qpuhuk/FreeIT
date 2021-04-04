package AlexLink.HomeWork.InterfacePerson.Jacket;

public class JacketOne implements Jacket{


    @Override
    public void putItOn() {
        System.out.println(" надевает куртку фирмы \"Зимняя\"");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает куртку фирмы \"Зимняя\"");
    }
}
