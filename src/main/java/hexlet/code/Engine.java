package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static int winsCounter = 0;

    public static void gameEngine(String[][] arrayResult, String rules) {
        Cli.greeting();
        Scanner scanner = new Scanner(System.in);
        if (winsCounter == 0) {
            System.out.println(rules);
        }


        for (int i = 0; i != 3; i++) {
            System.out.println("Question: " + arrayResult[i][0]);
            String answer = scanner.nextLine();
            if (answer.equals(arrayResult[i][1])) {
                System.out.println("Correct!");
                winsCounter++;
                checkWinsCounter();
            } else {
                System.out.println("'" + answer +  "' is wrong answer ;(. Correct answer was '" + arrayResult[i][1]
                        + "'.\nLet's try again, " + Cli.userName + "!");
                break;
            }
        }
    }

    public static void checkWinsCounter() {
        if (winsCounter == 3) {
            System.out.println("Congratulations, " + Cli.userName);
        }
    }
}