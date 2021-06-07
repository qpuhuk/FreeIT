package AlexLink.HomeWork.InterfaceCosmos;

public class Run {
    public static void main(String[] args) {
        IStart iStart = new Shuttle();
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.goStart(iStart);
    }
}
