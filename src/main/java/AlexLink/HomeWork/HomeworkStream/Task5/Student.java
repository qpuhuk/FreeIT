package AlexLink.HomeWork.HomeworkStream.Task5;

public class Student {
    private String name;
    private String myClass;

    public Student(String name, String myClass) {
        this.name = name;
        this.myClass = myClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                '}';
    }
}
