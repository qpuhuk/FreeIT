package AlexLink.HomeWork.Arrays;

//Крестики-нолики
//
//Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
//по очереди вводят координаты клетки в которую хотят сделать ход. После
//каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
//Игра продолжается до победы одного из игроков или ничьи.

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {


    static String[][] gameArea = new String[3][3];
    static Scanner scanner = new Scanner(System.in);
    static boolean check = true;

    public static void main(String[] args) {

        fillBasicGameArea();
        System.out.println("Игра начинается: ");
        drawActualGameArea();
        System.out.println("Первый ход делает игрок №1");

        while (check) {
            stepPlayer1();
            drawActualGameArea();
            check = checkGame();
            if (!check)
                break;
            stepPlayer2();
            drawActualGameArea();
            check = checkGame();
            if (!check)
                break;
        }
    }

    static void drawActualGameArea() {
        for (int i = 0; i < gameArea.length; i++) {
            for (int j = 0; j < gameArea[i].length; j++) {
                System.out.print(gameArea[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void fillBasicGameArea() {
        for (int i = 0; i < gameArea.length; i++) {
            Arrays.fill(gameArea[i], "___");
        }
    }

    static boolean checkGame() {
        int count = 0;
        for (int i = 0; i < gameArea.length; i++) {
            for (int j = 0; j < gameArea[i].length; j++) {
                if (gameArea[i][j].equals(" Х ") || gameArea[i][j].equals(" О "))
                    count++;
            }
        }
        if (count == 9) {
            System.out.println("Игра закончена. Ничья");
            return false;
        }
        if (gameArea[0][0].equals(gameArea[0][1]) && gameArea[0][1].equals(gameArea[0][2])) {
            if (gameArea[0][0].equals(" Х ")) {
                System.out.println("Игра закончена. Победил игрок №1");
                return false;
            }
            if (gameArea[0][0].equals(" О ")) {
                System.out.println("Игра закончена. Победил игрок №2");
                return false;
            }
        }
        if (gameArea[1][0].equals(gameArea[1][1]) && gameArea[1][1].equals(gameArea[1][2])) {
            if (gameArea[1][0].equals(" Х ")) {
                System.out.println("Игра закончена. Победил игрок №1");
                return false;
            }
            if (gameArea[1][0].equals(" О ")) {
                System.out.println("Игра закончена. Победил игрок №2");
                return false;
            }
        }
        if (gameArea[2][0].equals(gameArea[2][1]) && gameArea[2][1].equals(gameArea[2][2])) {
            if (gameArea[2][0].equals(" Х ")) {
                System.out.println("Игра закончена. Победил игрок №1");
                return false;
            }
            if (gameArea[2][0].equals(" О ")) {
                System.out.println("Игра закончена. Победил игрок №2");
                return false;
            }
        }
        if (gameArea[0][0].equals(gameArea[1][0]) && gameArea[1][0].equals(gameArea[2][0])) {
            if (gameArea[0][0].equals(" Х ")) {
                System.out.println("Игра закончена. Победил игрок №1");
                return false;
            }
            if (gameArea[0][0].equals(" О ")) {
                System.out.println("Игра закончена. Победил игрок №2");
                return false;
            }
        }
        if (gameArea[0][1].equals(gameArea[1][1]) && gameArea[1][1].equals(gameArea[2][1])) {
            if (gameArea[0][1].equals(" Х ")) {
                System.out.println("Игра закончена. Победил игрок №1");
                return false;
            }
            if (gameArea[0][1].equals(" О ")) {
                System.out.println("Игра закончена. Победил игрок №2");
                return false;
            }
        }
        if (gameArea[0][2].equals(gameArea[1][2]) && gameArea[1][2].equals(gameArea[2][2])) {
            if (gameArea[0][2].equals(" Х ")) {
                System.out.println("Игра закончена. Победил игрок №1");
                return false;
            }
            if (gameArea[0][2].equals(" О ")) {
                System.out.println("Игра закончена. Победил игрок №2");
                return false;
            }
        }
        if (gameArea[0][0].equals(gameArea[1][1]) && gameArea[1][1].equals(gameArea[2][2])) {
            if (gameArea[0][0].equals(" Х ")) {
                System.out.println("Игра закончена. Победил игрок №1");
                return false;
            }
            if (gameArea[0][0].equals(" О ")) {
                System.out.println("Игра закончена. Победил игрок №2");
                return false;
            }
        }
        if (gameArea[0][2].equals(gameArea[1][1]) && gameArea[1][1].equals(gameArea[2][0])) {
            if (gameArea[0][2].equals(" Х ")) {
                System.out.println("Игра закончена. Победил игрок №1");
                return false;
            }
            if (gameArea[0][2].equals(" О ")) {
                System.out.println("Игра закончена. Победил игрок №2");
                return false;
            }
        }
        System.out.println("Следующий ход");
        return true;
    }

    static void stepPlayer1() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        gameArea[x][y] = " Х ";
    }

    static void stepPlayer2() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        gameArea[x][y] = " О ";
    }
}

