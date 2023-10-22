package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Randomize;

public class Even {
    public static void evenGame() {
        String name = Cli.greeting();
        System.out.println("""
                Answer 'yes' if the number is even, otherwise answer 'no'.""");
        int num = 0;
        String expression ="";
        String actually = "";
        String except = "";
        boolean check;
        for (int i = 0; i < 3; i++) {
            num = Randomize.generateNum(1, 1000);
            expression = String.valueOf(num);
            Engine.generateQuastion(expression);
            if (num % 2 == 0) except = "yes";
            else except = "no";
            actually = Engine.userAnswer();
            check = Engine.checkAnswer(except, actually);
            Engine.result(check, except, actually, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
