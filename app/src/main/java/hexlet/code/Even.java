package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenGame() {
        String name = Cli.greeting();
        System.out.println("""
                Answer 'yes' if the number is even, otherwise answer 'no'.""");
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        String actually = "";
        String except = "";
        for (int i = 0; i < 3; i++) {
            num = Randomize.generateNum();
            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            actually = scanner.nextLine();
            if (num % 2 == 0) except = "yes";
            else except = "no";
            if (actually.equals(except)) System.out.println("Correct!");
            else if (!actually.equals(except)) {
                System.out.println("'" + actually + "' is wrong answer ;(. Correct answer was '" + except + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
