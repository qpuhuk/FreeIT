package AlexLink.HomeWork.XML;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Device {

    private int id;
    private String name;
    private String origin;
    private int price;
    private Type type;

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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Device(int id, String name, String origin, int price, Type type) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.type = type;
    }
}
