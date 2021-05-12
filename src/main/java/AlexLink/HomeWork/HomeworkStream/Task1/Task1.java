package AlexLink.HomeWork.HomeworkStream.Task1;

//������� ���� �������������� ��������� ��� ������ �� ������� ������ �������.
//� ������� ������-��������� ������� ������ ��� �������� ���� String � Integer.

public class Task1 {
    public static void main(String[] args) {

        Animal cat = new Cat("Murzik", 10);
        Animal dog = new Dog("Jessi", 20);
        Run run = a -> System.out.println("Speed of the " + a.getName() + " = " + a.getSpeed());

        run.run(cat);
        run.run(dog);
    }
}
