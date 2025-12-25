package com.projectpin.service;

import com.projectpin.model.GuessResult;

public class MatchingEngine {
    public static GuessResult evaluate(String target, String guess) {
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else if (target.contains(guess.substring(i, i + 1))) {
                cows++;
            }
        }


        return new GuessResult(guess, bulls, cows);
    }
}
