package hexlet.code;


import java.util.Scanner;

public class Engine {
    private static final int COUNTER = 3;

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

    public static void gameEngine(String[][] arrayResult, String rules) {
        greeting();
        int winsCounter = 0;
        for (int i = 0; i != COUNTER; i++) {
            System.out.println("Question: " + arrayResult[i][0]);
            String answer = getAnswer();
            if (answer.equals(arrayResult[i][1])) {
                correctAnswer();
                winsCounter++;
                checkWinsCounter(winsCounter);
            } else {
                wrongAnwer(answer, arrayResult[i][1]);
                break;
            }
        }
    }

    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        return scanner.nextLine();
    }

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

    public static void wrongAnwer(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer +  "' is wrong answer ;(. Correct answer was '" + correctAnswer
                + "'.\nLet's try again, " + getName() + "!");
    }

    public static void checkWinsCounter(int winsCounter) {
        if (winsCounter == COUNTER) {
            System.out.println("Congratulations, " + getName() + "!");
        }
    }
}
