package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName = "";

    public static String getName() {
        return userName;
    }


    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}

