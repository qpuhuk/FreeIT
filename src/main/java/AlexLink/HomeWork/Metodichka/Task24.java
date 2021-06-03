package AlexLink.HomeWork.Metodichka;

//Задание 24
//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.

public class Task24 {
    public static void main(String[] args) {
        Time time = new Time(5000);
        Time time1 = new Time(50, 10, 1);
        System.out.println("Количество секунд в объекте №1 = " + time.getSec() + "\n*******************");
        System.out.println("Количество секунд в объекте №2 = " + time1.getSec() + "\n*******************");
        System.out.println("Выводим оба объекта в консоль при помощи метода print(): ");
        time.print();
        time1.print();
        System.out.println("*******************");
        System.out.print("Наибольшее время = ");
        int result = time.compareTime(time1);
        System.out.println(result);
    }

    static class Time {

        private final int sec;
        private final int min;
        private final int hours;

        public Time(int sec) {
            hours = sec / 3600;
            min = sec % 3600 / 60;
            this.sec = sec % 3600 % 60;
        }

        public Time(int sec, int min, int hours) {
            this.sec = sec;
            this.min = min;
            this.hours = hours;
        }

        public int getSec() {
            return hours * 3600 + min * 60 + sec;
        }

        public int compareTime(Time t) {
            return Integer.compare(this.getSec(), t.getSec());
        }

        void print() {
            System.out.printf("%d час(ов), %d минут(а) %d секунд(а)\n", hours, min, sec);
        }
    }
}
