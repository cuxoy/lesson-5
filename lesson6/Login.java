package lesson6;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void loginCheck() throws IOException {
        System.out.println("Please, Enter your username :");
        Scanner user = new Scanner(System.in);
        String userName = user.nextLine();
        System.out.println("Please, Enter your password : ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        FileReader fileReader = new FileReader("src/main/resources/users.txt");
        Scanner scanText = new Scanner(fileReader);

        while (scanText.hasNextLine()) {
            String login = scanText.nextLine();
            String pass = scanText.nextLine();

            if (login.equals(userName) && pass.equals(password)) {
                System.out.println("Welcome!!!!!!");
            } else System.out.println("Wrong username or password!!!!");

//так и не получилось проверить ввод 3 раза( Если не сложно, покажи что нужно было сделать
        }

        fileReader.close();
    }
}

