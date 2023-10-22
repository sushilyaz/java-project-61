package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Randomize;

public class Calculate {
    public static void calculateGame() {
        String name = Cli.greeting();
        System.out.println("""
                What is the result of the expression?""");
        boolean check;
        int num1 = 0;
        int num2 = 0;
        int index = 0;
        String[] arrayOperations = {"+", "-", "*"};
        String expression = "";
        String actually = "";
        String except = "";
        for (int i = 0; i < 3; i++) {
            num1 = Randomize.generateNum(1, 1000);
            num2 = Randomize.generateNum(1, 1000);
            index = Randomize.generateNum(0, 2);
            expression = String.valueOf(num1 + " " + arrayOperations[index] + " " + num2);
            Engine.generateQuastion(expression);
            if (arrayOperations[index].equals("+")) {
                except = String.valueOf(num1 + num2);
            } else if (arrayOperations[index].equals("*")) {
                except = String.valueOf(num1 * num2);
            } else if (arrayOperations[index].equals("-")) {
                except = String.valueOf(num1 - num2);
            }
            actually = Engine.userAnswer();
            check = Engine.checkAnswer(except, actually);
            Engine.result(check, except, actually, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
