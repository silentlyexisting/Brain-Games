package hexlet.code;

import java.util.Scanner;

public class Cli {
     public static String greeting() {
        Scanner scanner = new Scanner(System.in);
        String getUserName;
        System.out.print("May I have your name? ");
        getUserName = scanner.nextLine();
        return "Hello, " + getUserName + "!";
    }
}