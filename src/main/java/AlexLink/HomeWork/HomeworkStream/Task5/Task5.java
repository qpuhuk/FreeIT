package AlexLink.HomeWork.HomeworkStream.Task5;

//Задать список учеников с принадлежностью к классу (создать класс Student).
//Используя средства Stream API 1) вывести список фамилий 2) создать Map со
//списком учеников для каждого класса

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        Student student = new Student("Sasha", "A");
        Student student1 = new Student("Vanya", "B");
        Student student2 = new Student("Dasha", "G");
        Student student3 = new Student("Oleg", "A");
        Student student4 = new Student("Masha", "A");
        Student student5 = new Student("Olga", "B");
        Student student6 = new Student("Anya", "G");
        Student student7 = new Student("Natasha", "A");
        Student student8 = new Student("Kseniya", "A");

        List<Student> students = Arrays.asList(student, student1, student2, student3, student4, student5, student6, student7, student8);
        System.out.println("List of all names: ");
        students.stream().forEach(a -> System.out.println(a.getName()));
        System.out.println("**********************************");
        System.out.println("List of students divided by class: ");
        Map<String, List<Student>> school = students.stream().collect(Collectors.groupingBy(Student::getMyClass));
        System.out.println(school.toString());
    }
}
