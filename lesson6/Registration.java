package lesson6;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Registration {
    public static void EnterPassword() throws IOException {
        System.out.println("Enter your username :");
        Scanner user = new Scanner(System.in);
        String userName = user.nextLine();
        System.out.println("Enter your password : ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println("Confirm your password : ");
        Scanner scannerConfirm = new Scanner(System.in);
        String passwordConfirm = scannerConfirm.nextLine();
        if (password.equals(passwordConfirm)) {
            System.out.println("Welcome!!!!!!");
            FileWriter fileWriter = new FileWriter("src/main/resources/users.txt");
            fileWriter.write(userName);
            fileWriter.write("\n");
            fileWriter.write(passwordConfirm);
            fileWriter.close();

        } else System.out.println("Wrong password!!!!");


    }

}
