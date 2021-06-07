package AlexLink.HomeWork.Metodichka;

//Задание 25
//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
//банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
//50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр.

public class Task25 {
    public static void main(String[] args) {

        ATM atm = new ATM(5, 10, 10);
        atm.print();
        atm.addMoney(1180);
        atm.print();
        if (atm.cash(1130)) {
            System.out.println("Операция снятия средств прошла успешно");
        } else {
            System.out.println("Ошибка");
        }
        atm.print();
    }


    static class ATM {
        private int count20;
        private int count50;
        private int count100;

        public ATM(int count20, int count50, int count100) {
            this.count20 = count20;
            this.count50 = count50;
            this.count100 = count100;
        }

        void addMoney(int money) {
            System.out.println("Запрос на пополнение баланса на сумму: " + money);
            if (money <= 0 || (money < 50 && money % 20 != 0) || (money >= 50 && money % 10 != 0)) {
                System.out.println("Операция не удалась");
            } else {
                if ((money % 100) % 20 == 0) {
                    count100 += money / 100;
                    count20 += money % 100 / 20;
                } else if (money % 100 < 50 && money / 100 >= 1) {
                    count100 += money / 100 - 1;
                    count50 += money % 100 / 50 + 1;
                    count20 += (money % 100 + 50) / 20;
                } else {
                    count100 += money / 100;
                    count50 += money % 100 / 50;
                    count20 += money % 100 % 50 / 20;
                }

                System.out.println("Операция пополнения прошла успешно");
            }
        }

        boolean cash(int money) {
            int tempCount20 = count20;
            int tempCount50 = count50;
            int tempCount100 = count100;
            System.out.println("Запрос на снятие средств: ...");
            if (money > count20 * 20 + count50 * 50 + count100 * 100) {
                System.out.println("Недостаточно средств в банкомате");
                return false;

            } else if (money < 20) {
                System.out.println("Минимальная сумма для обналичивания равна 20");
                return false;

            } else if ((money < 50 && money % 20 != 0) || (money > 50 && money % 10 != 0)) {
                System.out.println("Недостаточно купюр необходимого номинала");
                return false;

            } else {
                int give100 = 0;
                int give50 = 0;
                int give20 = 0;

                if ((money / 100) <= count100) {
                    if ((money % 100) < 50 && money / 100 >= 1) {
                        count100 -= money / 100 - 1;
                        give100 = money / 100 - 1;
                        money = money % 100 + 100;
                    } else {
                        count100 -= money / 100;
                        give100 = money / 100;
                        money = money % 100;
                    }
                } else {
                    give100 = count100;
                    money = (money % 100) + ((money / 100 - count100) * 100);
                    count100 = 0;
                }

                if (money / 50 <= count50) {
                    if ((money % 50) % 20 == 0) {
                        give50 = money / 50;
                        count50 -= money / 50;
                        money = money % 50;
                    } else if ((money % 100 < 50) && (4 <= count20)) {
                        give50 = money / 50 - 1;
                        count50 -= money / 50 - 1;
                        money = money % 50 + 50;
                        give20 = money / 20;
                        count20 -= money / 20;
                        System.out.printf("Выдано количество купюр номиналом: \n100 - %d штук(а, и), 50 - %d штук(а, и), 20 - %d штук(а, и)\n",
                                give100, give50, give20);
                        return true;
                    } else {
                        System.out.println("Недостаточно купюр номиналом 20");
                        count20 = tempCount20;
                        count50 = tempCount50;
                        count100 = tempCount100;
                        return false;
                    }
                } else {
                    give50 = count50;
                    money = (money % 50) + ((money / 50 - count50) * 50);
                    count50 = 0;
                }

                if (money / 20 <= count20) {
                    give20 = money / 20;
                    count20 -= money / 20;
                } else {
                    System.out.println("Недостаточно купюр номиналом 20");
                    count20 = tempCount20;
                    count50 = tempCount50;
                    count100 = tempCount100;
                    return false;
                }
                System.out.printf("Выдано количество купюр номиналом: \n100 - %d штук(а, и), 50 - %d штук(а, и), 20 - %d штук(а, и)\n", give100, give50, give20);
                return true;
            }
        }

        void print() {
            System.out.printf("Остаток баланса: купюр номиналом 100 = %d штук(а, и), купюр номиналом 50 = %d штук(а, и), " +
                    "купюр номиналом 20 = %d штук(а, и)\n", count100, count50, count20);
        }
    }
}



