package com.projectpin.model;

import java.util.List;

public class GameStatusResponse {
    private final String gameId;
    private final int attempts;
    private final boolean isWon;
    private final List<GuessResult> guesses;

    public GameStatusResponse(String gameId, int attempts, boolean isWon, List<GuessResult> guesses) {
        this.gameId = gameId;
        this.attempts = attempts;
        this.isWon = isWon;
        this.guesses = guesses;
    }

    public String getGameId() {
        return gameId;
    }

    public int getAttempts() {
        return attempts;
    }

    public boolean isWon() {
        return isWon;
    }

    public List<GuessResult> getGuesses() {
        return guesses;
    }
}
