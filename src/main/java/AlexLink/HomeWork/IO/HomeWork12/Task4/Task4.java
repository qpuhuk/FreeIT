package AlexLink.HomeWork.IO.HomeWork12.Task4;

//4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
//сериализации произвести обратный процесс

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        Avto avto = new Avto("Audi", 30000, 280);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
            objectOutputStream.writeObject(avto);
            System.out.println(avto);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.ser"))) {
            Avto avto1 = (Avto) objectInputStream.readObject();
            System.out.println(avto1);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
