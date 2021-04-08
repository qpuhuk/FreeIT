package AlexLink.HomeWork.HW7.Gradebook;

//4. Создать класс Зачетная Книжка с внутренним классом, с помощью объек-
//тов которого можно хранить информацию о сессиях, зачетах, экзаменах.

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<GradeBook.Exam> examArrayList = new ArrayList<>();
        GradeBook gradeBook = new GradeBook();

        examArrayList.add(gradeBook.addExam("Русский язык", 7, "Экзамен"));
        examArrayList.add(gradeBook.addExam("Математика", 8, "Зачет"));
        examArrayList.add(gradeBook.addExam("ИЗО", 5, "Экзамен"));

        System.out.println(gradeBook.toString());
        examArrayList.forEach(System.out::println);
        System.out.println("Общее количество предметов : " + gradeBook.getCountExam() +
                "\nСредний балл : " + String.format("%.1f",gradeBook.getMiddleScore()));
    }
}
