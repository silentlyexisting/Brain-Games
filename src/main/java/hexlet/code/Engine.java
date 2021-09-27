package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static String greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void gameEngine(String[][] arrayResult, String rules) {
        String userName = greeting();
        System.out.println(rules);
        int winsCounter = 0;
        for (int i = 0; i != Util.COUNTER; i++) {
            System.out.println("Question: " + arrayResult[i][0]);
            String answer = getAnswer();
            if (answer.equals(arrayResult[i][1])) {
                correctAnswer();
                winsCounter++;
                checkWinsCounter(winsCounter, userName);
            } else {
                wrongAnwer(answer, arrayResult[i][1], userName);
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

    public static void wrongAnwer(String userAnswer, String correctAnswer, String userName) {
        System.out.println("'" + userAnswer +  "' is wrong answer ;(. Correct answer was '" + correctAnswer
                + "'.\nLet's try again, " + userName + "!");
    }

    public static void checkWinsCounter(int winsCounter, String userName) {
        if (winsCounter == Util.COUNTER) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
