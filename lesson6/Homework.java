package lesson6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Homework {
    public static void firstTask() {
        String str = " Hillel is my feature. I will be developer   ";
        System.out.println("Проверка на пустоту : " + str.isEmpty());
        System.out.println("Длинна текста : " + str.length());
        System.out.println("Без пробелов :" + str.trim());
        System.out.println("Конкретный символ :" + str.charAt(23));
        System.out.println("Обрезание :" + str.substring(33, 42));
        System.out.println("Прибавить ! : " + str.concat("!"));
        String equ = " Hillel is my feature. I will be DEVELOPER   ";
        System.out.println("Сравнение текста : " + str.equals(equ));
        System.out.println("Сравнение текста  : " + str.equalsIgnoreCase(equ));
        System.out.println("Нижний регистр : " + str.toLowerCase());
        System.out.println("Верхний регистр : " + str.toUpperCase());
    }

    public static void secondTask() {
        char unicode1 = 9200;
        char unicode2 = 4138;
        char unicode3 = 9193;
        ;
        char unicode4 = 65083;
        char unicode5 = 42245;
        System.out.println("unocode 1 : " + unicode1);
        System.out.println("unocode 2 : " + unicode2);
        System.out.println("unocode 3 : " + unicode3);
        System.out.println("unocode 4 : " + unicode4);
        System.out.println("unocode 5 : " + unicode5);
    }

    public static void write() throws IOException {
        String path = "src/main/resources/poetries/poetry.txt";
        Path pathTofile = Paths.get(path);
        if (!Files.exists(pathTofile.getParent()))
            Files.createDirectories(pathTofile.getParent());
        FileWriter fileWriter = new FileWriter(path);
        String poem = "Ночь,улица,фонарь,аптека,\nБессмысленный и тусклый свет.\n" +
                "Живи еще хоть четверть века,\n" +
                "Все будет так, исхода нет...";
        fileWriter.write(poem);
        fileWriter.close();

    }

    public static void read() throws IOException {
        String path = "src/main/resources/poetries/poetry.txt";
        FileReader read = new FileReader(path);
        Scanner scanner = new Scanner(read);
        System.out.println("Проверка на выполнение : ");
        while (scanner.hasNextLine()) {
            String check = scanner.nextLine();
            if (check.equalsIgnoreCase("Ночь,улица,фонарь,аптека,\nБессмысленный и тусклый свет.\n" +
                    "Живи еще хоть четверть века,\n" +
                    "Все будет так, исхода нет...")) ;
            System.out.println(check);


        }

        scanner.close();
        read.close();


    }
}