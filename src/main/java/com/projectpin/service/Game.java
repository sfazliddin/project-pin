package com.projectpin.service;

import com.projectpin.model.GuessResult;

import java.util.ArrayList;
import java.util.List;

import static com.projectpin.service.MatchingEngine.evaluate;


public class Game {
    private final String numberToGuess;
    private final List<GuessResult> guessHistory;
    private int guessCounter;
    private boolean isGameOver;

    public Game() {
        this.numberToGuess = NumberGenerator.generateNumber();
        this.guessHistory = new ArrayList<>();
        this.guessCounter = 0;
        this.isGameOver = false;
    }

    // TODO: Implement these methods
    public GuessResult makeGuess(String guess) {
        if (isGameOver) {
            throw new IllegalStateException("Game is already won!");
        }

        // Validate guess
        if (!PinValidator.isValid(guess)) {
            throw new IllegalArgumentException("Invalid guess format!!");
        }

        // Evaluate guess
        GuessResult result = evaluate(numberToGuess, guess);
        // Store result in guessHistory
        guessHistory.add(result);
        // Increment attempts
        guessCounter++;
        // Update isWon if result.isWin()
        isGameOver = result.isWin();
        // Return result
        return result;
    }

    public boolean isWon() {
        return isGameOver;
        // return isWon;
    }

    public int getAttempts() {
        return guessCounter;
        // return attempts;
    }

    public List<GuessResult> getGuessHistory() {
        // return new ArrayList<>(guessHistory);
        return new ArrayList<>(guessHistory);
    }

//    public void play(){
//
//
//    //a number is generated
//
//    //number is guessed
//    Scanner scanner=new Scanner(System.in);
//
//    String guess="";
//
//    while(!isGameOver){
//        boolean isValid=false;
//        while (!isValid){
//            System.out.println("Take a guess");
//            guess=scanner.nextLine();
//            isValid= PinValidator.isValid(guess);
//            if(!isValid){
//                System.out.println("Guess has to be 4 unique digits!!");
//            }
//        }
//        guessCounter++;
//        GuessResult result=evaluate(numberToGuess,guess);
//        System.out.println(result);
//
//        isGameOver=result.isWin();
//    }
//    System.out.println("Congratulations, You Win!");
//    System.out.println("You won in "+ guessCounter +" guesses.");
//    scanner.close();
//
//    //number is checked and feedback is given
//    //game ends when user gets the number correct
//}
}
