package AlexLink.HomeWork.Annotation;

import java.util.Objects;

@Version(numberVersion = 1.11, secretName = "Korova")
public class MyService {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return id == myService.id && Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "MyService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secretName= " + MyService.class.getAnnotation(Version.class).numberVersion() +
                '}';
    }
}
