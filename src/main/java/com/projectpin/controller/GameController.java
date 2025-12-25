package com.projectpin.controller;

import com.projectpin.model.GuessResult;
import com.projectpin.service.Game;
import com.projectpin.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/game")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService){
        this.gameService=gameService;
    }
    // TODO: Add these three endpoints:

    // POST /api/game/start
    @PostMapping("/start")
    public ResponseEntity<Objects> startGame() {
        // Call gameService.createGame()
        String game=gameService.createGame();
        // Return the game ID (maybe in a response object?)
        if (gameService.getGame(game)!=null){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return ErrorResponse.builder();
    }

    // POST /api/game/{id}/guess
    @PostMapping("/{id}/guess")
    public ??? makeGuess(@PathVariable String id, @RequestBody ??? guessRequest) {
        // Call gameService.makeGuess(id, guess)
        // Return the result
    }

    // GET /api/game/{id}
    @GetMapping("/{id}")
    public ??? getGameStatus(@PathVariable String id) {
        // Call gameService.getGame(id)
        // Return game info
    }
}
