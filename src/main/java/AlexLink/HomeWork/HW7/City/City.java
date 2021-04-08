package AlexLink.HomeWork.HW7.City;

public class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static class Street extends Title {
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
    }
}

