import com.projectpin.console.Game;
import com.projectpin.console.GuessValidator;
import com.projectpin.console.MatchingEngine;
import com.projectpin.console.NumberGenerator;

import java.util.Scanner;

import static com.projectpin.console.MatchingEngine.evaluate;


public class App {
    public static void main(String[] args) {
        Game game=new Game();
        game.play();
//        for (int i=0;i<10;i++) {
//            System.out.println(NumberGenerator.generateNumber());
//        }
//        Scanner scanner=new Scanner(System.in);
//        String numberToGuess=NumberGenerator.generateNumber();
//        String guess="";
//        boolean isValid=false;
//
//        System.out.println(numberToGuess);
//
//        while (!isValid){
//            System.out.println("Take a guess");
//            guess=scanner.nextLine();
//            isValid=GuessValidator.isValid(guess);
//        }
//
//        System.out.println(MatchingEngine.evaluate(numberToGuess,guess));
//
//        scanner.close();
//        System.out.println(evaluate("1234", "1234")); // Should be 4 bulls, 0 cows
//        System.out.println(evaluate("1234", "5678")); // Should be 0 bulls, 0 cows
//        System.out.println(evaluate("1234", "2341")); // Should be 0 bulls, 4 cows
//        System.out.println(evaluate("1234", "1357")); // Should be 1 bull, 0 cows
//        System.out.println(evaluate("1234", "4321")); // Should be 0 bulls, 4 cows
    }
}
