package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void generateQuastion(String quastion) {
        System.out.println("Question: " + quastion);
        System.out.print("Your answer: ");
    }
    public static String userAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static boolean checkAnswer(String except, String actually) {
        return actually.equals(except);
    }
    public static void result(boolean check, String except, String actually, String name) {
        if (check) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + actually + "' is wrong answer ;(. Correct answer was '" + except + "'");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }
    }
}
