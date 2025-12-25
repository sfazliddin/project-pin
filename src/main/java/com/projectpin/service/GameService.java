package com.projectpin.service;

import com.projectpin.model.GuessResult;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class GameService {
    private Map<String,Game> games=new HashMap<>();

    public String createGame() {
        // Generate unique ID
        String id=UUID.randomUUID().toString();
        // Create new Game
        Game game=new Game();

        // Store in map
        games.put(id,game);
        // Return ID
        return id;
    }
    public Game getGame(String id){
        Game game=games.get(id);
        if(game==null){
            throw new RuntimeException("Game not found");

        }
        return game;
    }
    public GuessResult makeGuess(String id, String guess){
        // Get game by ID
        Game game=getGame(id);
        // Call game.makeGuess(guess)
        GuessResult result= game.makeGuess(guess);
        // Return result
        return result;

    }
}
