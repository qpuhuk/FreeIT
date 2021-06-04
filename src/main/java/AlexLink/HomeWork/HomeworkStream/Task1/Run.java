package AlexLink.HomeWork.HomeworkStream.Task1;

@FunctionalInterface
public interface Run {
    void run(Animal pet);

    default void info(Animal pet) {
        System.out.println(pet.getClass().getSimpleName() + " running");
    }
}
