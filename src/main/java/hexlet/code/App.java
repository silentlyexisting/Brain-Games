package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
  private static final int CLI_GREET = 1;
  private static final int EVEN_GAME = 2;
  private static final int CALC_GAME = 3;
  private static final int GCD_GAME = 4;
  private static final int PROGRESSION_GAME = 5;
  private static final int PRIME_GAME = 6;

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

    switch (sc.nextInt()) {
      case CLI_GREET: Cli.greeting();
        break;
      case EVEN_GAME: Even.launchEvenGame();
        break;
      case CALC_GAME: Calc.launchCalcGame();
        break;
      case GCD_GAME: GCD.launchGcdGame();
        break;
      case PROGRESSION_GAME: Progression.launchProgressionGame();
        break;
      case PRIME_GAME: Prime.launchPrimeGame();
      default:
    }
  }
}
