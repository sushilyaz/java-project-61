package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static String greeting() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello, " + input + "!");
        return input;
    }
}
