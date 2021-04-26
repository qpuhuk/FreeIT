package AlexLink.HomeWork.IO.Tasks;

//Задание 36
//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//должны быть распечатаны отдельно.

import java.io.File;

public class Task36 {
    public static void main(String[] args) {
        File file = new File("F:\\project\\MyHomeWork\\FreeIT");
        File[] list = file.listFiles();
        System.out.println("Print catalogs: ");

        assert list != null;
        for (File name : list) {
            if (name.isDirectory()) {
                System.out.println(name);
            }
        }
        System.out.println("Print files: ");
        for (File name : list) {
            if (name.isFile()) {
                System.out.println(name);
            }
        }
    }
}
