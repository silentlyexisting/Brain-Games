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

    public static void runEngine(String[][] questionsAndAnswers, String rules) {
        String userName = greeting();
        System.out.println(rules);
        for (String[] questionAnswer : questionsAndAnswers) {
            System.out.println("Question: " + questionAnswer[0]);
            String answer = getAnswer();
            if (!answer.equals(questionAnswer[1])) {
                System.out.println("'" + answer +  "' is wrong answer ;(. Correct answer was '" + questionAnswer[1]
                        + "'.\nLet's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        return scanner.nextLine();
    }
}
