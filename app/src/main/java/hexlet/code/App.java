package hexlet.code;

import hexlet.code.games.Calculate;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progress;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculate
                4 - gcd
                5 - Progress
                6 - Prime
                0 - Exit
                Your choice:\s""");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
            Cli.greeting();
            return;
        } else if (input.equals("2")) {
            Even.evenGame();
            return;
        } else if (input.equals("3")) {
            Calculate.calculateGame();
            return;
        } else if (input.equals("4")) {
            Gcd.ncdGame();
            return;
        } else if (input.equals("5")) {
            Progress.gameProgress();
            return;
        } else if (input.equals("6")) {
            Prime.gamePrime();
            return;
        }
    }
}
