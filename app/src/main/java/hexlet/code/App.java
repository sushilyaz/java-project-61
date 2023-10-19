package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                0 - Exit
                Your choice:\s""");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "1": {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
            }
        }
    }
}
