package AlexLink.HomeWork.HomeworkStream.Task1;

@FunctionalInterface
public interface Run {
    void run(Animal pet);
    default void info() {
        System.out.println("Object running");
    }
}
