package AlexLink.HomeWork.HW7.City;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Title> listStreetsAndSquares;

    public City(String name) {
        this.name = name;
        listStreetsAndSquares = new ArrayList<>();
    }

    public List<Title> getListStreetsAndSquares() {
        return listStreetsAndSquares;
    }

    void addStreetOrSquare(Title title) {
        listStreetsAndSquares.add(title);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Street extends Title {
        private int length;

        public Street(String title, int length) {
            super(title);
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        @Override
        public String toString() {
            return "Street{" +
                    "length=" + length +
                    "} " + super.toString();
        }
    }

    class Square extends Title {
        private int square;

        public Square(String title, int square) {
            super(title);
            this.square = square;
        }

        public int getSquare() {
            return square;
        }

        public void setSquare(int square) {
            this.square = square;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "square=" + square +
                    "} " + super.toString();
        }
    }
}

