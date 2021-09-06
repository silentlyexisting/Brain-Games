package hexlet.code;

import java.util.Scanner;

public class App {
  private static int numOfGame = -1;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the game number and press Enter.\n"
            + "1 - Greet\n"
            + "2 - Even\n"
            + "3 - Calc\n"
            + "4 - GCD\n"
            + "5 - Progression\n"
            + "6 - Prime\n"
            + "0 - Exit\n"
            + "Your choise: ");
    numOfGame = sc.nextInt();

    switch (numOfGame) {
      case 1:
        Cli.greeting();
        break;
      case 2:
        Even.launchEvenGame();
        break;
      case 3:
        Calc.launchCalcGame();
        break;
      case 4:
        GCD.launchGcdGame();
        break;
      case 5:
        Progression.launchProgressionGame();
        break;
      case 6:
        Prime.launchPrimeGame();
      default:
    }
  }
}
