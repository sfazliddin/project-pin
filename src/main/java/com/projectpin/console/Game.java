package com.projectpin.console;

import java.util.Scanner;
import static com.projectpin.console.MatchingEngine.evaluate;
import static com.projectpin.console.NumberGenerator.generateNumber;




public class Game {
public void play(){


    //a number is generated
    String numberToGuess=generateNumber();
    //number is guessed
    Scanner scanner=new Scanner(System.in);
    String guess="";
    boolean isGameOver=false;
    while(!isGameOver){
        boolean isValid=false;
        while (!isValid){
            System.out.println("Take a guess");
            guess=scanner.nextLine();
            isValid=GuessValidator.isValid(guess);
        }
        GuessResult result=evaluate(numberToGuess,guess);
        System.out.println(result);

        isGameOver=result.isWin();
    }
    System.out.println("Congratulations, You Win!");
    scanner.close();

    //number is checked and feedback is given
    //game ends when user gets the number correct
}
}
