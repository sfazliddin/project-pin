package com.projectpin.model;

public class GuessResult {

    private final String guess;
    private final int bulls;
    private final int cows;


    public GuessResult(String guess, int bulls, int cows) {
        this.guess = guess;
        this.bulls = bulls;
        this.cows = cows;
    }

    public boolean isWin() {
        return bulls == 4;
    }

    public String getGuess() {
        return guess;
    }


    public int getBulls() {
        return bulls;
    }


    public int getCows() {
        return cows;
    }


    @Override
    public String toString() {
        return guess + " -> Bulls: " + bulls + ", Cows: " + cows;
    }
}
