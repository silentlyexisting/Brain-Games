package hexlet.code;


import java.util.Scanner;

public class Engine {
    private static int winsCounter = 0;
    private static final int COUNTER = 3;

    public static void gameEngine(String[][] arrayResult, String rules) {
        Cli.greeting();
        Scanner scanner = new Scanner(System.in);
        if (winsCounter == 0) {
            System.out.println(rules);
        }


        for (int i = 0; i != COUNTER; i++) {
            System.out.print("Question: " + arrayResult[i][0] + "\nYour answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(arrayResult[i][1])) {
                System.out.println("Correct!");
                winsCounter++;
                checkWinsCounter();
            } else {
                System.out.println("'" + answer +  "' is wrong answer ;(. Correct answer was '" + arrayResult[i][1]
                        + "'.\nLet's try again, " + Cli.getName() + "!");
                break;
            }
        }
    }

    public static void checkWinsCounter() {
        if (winsCounter == COUNTER) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
