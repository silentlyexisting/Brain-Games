package hexlet.code;

import java.util.Scanner;

public class Even {

    public static String evenGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int minRandomRange = 1;
        final int maxRandomRange = 100;
    //    final int amountOfRounds = 3;
        for (int i = 0; i < Engine.ammountOfRounds; i++) {
            int randomNum = (int) Math.floor(Math.random() * (maxRandomRange - minRandomRange + 1)
                    + minRandomRange);
            System.out.println("Question: " + randomNum + "\nYour answer: ");
            String answer = scanner.nextLine();
            if (randomNum % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
            } else if (randomNum % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                return "'yes' is wrong answer ;(. Correct answer was 'no'.\n" + "Let's try again, " + Cli.userName;

            }
        }
        return "Congratulations, " + Cli.userName;
    }
}

