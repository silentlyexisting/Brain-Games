package hexlet.code;

import java.util.Scanner;

public class App {
  public static int numOfGame = -1;
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the game number and press Enter.\n" + "1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n" +
            "0 - Exit\n"
            + "Your choise: ");
    numOfGame = sc.nextInt();
    if (numOfGame == 1) {
      System.out.println(Cli.greeting());
    } else if (numOfGame == 2) {
      System.out.println(Cli.greeting());
      System.out.println(Even.evenGame());
    } else if (numOfGame == 3) {
      System.out.println(Cli.greeting());
      System.out.println(Calc.getRandom());
    } else if (numOfGame == 4) {
      System.out.println(Cli.greeting());
      System.out.println(GCD.getGcd());
    }
  }
}
