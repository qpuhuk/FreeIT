package AlexLink.HomeWork.HW_Generics;

import java.sql.Array;

public class Generics<T> {
    private T[] array;

    public Generics(T[] array) {
        this.array = array;
    }

    public T getArrayElementByIndex(int index) {
        if (index >= 0 && index < array.length)
            return array[index];
        else return null;
    }

    public void setArrayElementByIndex(int index, T value) {
        array[index] = value;
    }

    public int getLength() {
        return array.length;
    }
}
