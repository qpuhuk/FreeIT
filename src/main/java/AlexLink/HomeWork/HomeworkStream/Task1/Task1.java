package AlexLink.HomeWork.HomeworkStream.Task1;

//Создать свой функциональный интерфейс для вывода на консоль данных объекта.
//С помощью лямбда-выражения вывести данные для объектов типа String и Integer.

public class Task1 {
    public static void main(String[] args) {

        Animal cat = new Cat("Murzik", 10);
        Animal dog = new Dog("Jessi", 20);
        Run runCat = a -> System.out.println("His speed = " + a.getSpeed());
        Run runDog = a -> System.out.println("Her name = " + a.getName());

        runCat.info(cat);
        runCat.run(cat);
        runDog.info(dog);
        runDog.run(dog);
    }
}
