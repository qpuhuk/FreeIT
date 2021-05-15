package AlexLink.HomeWork.HW7.Gradebook;

//4. Создать класс Зачетная Книжка с внутренним классом, с помощью объек-
//тов которого можно хранить информацию о сессиях, зачетах, экзаменах.

public class Runner {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();
        gradeBook.addExam("Русский язык", 7, "Экзамен");
        gradeBook.addExam("Математика", 8, "Зачет");
        gradeBook.addExam("ИЗО", 5, "Экзамен");

        System.out.println(gradeBook);
        gradeBook.examList.forEach(System.out::println);
        System.out.println("Общее количество предметов : " + gradeBook.getCountExam() +
                "\nСредний балл : " + String.format("%.1f", gradeBook.getMiddleScore()));
    }
}
