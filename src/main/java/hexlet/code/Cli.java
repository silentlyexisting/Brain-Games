package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userName = "";
    public static String greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        userName = scanner.nextLine();
        return "Hello, " + userName + "!";
    }
}

