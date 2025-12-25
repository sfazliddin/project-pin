package com.projectpin.model;

public class GameStartResponse {
    private final String gameId;
    private final String message;

    public GameStartResponse(String gameId, String message) {
        this.gameId = gameId;
        this.message = message;
    }

    public String getGameId() {
        return gameId;
    }

    public String getMessage() {
        return message;
    }
}
