package com.projectpin.controller;

import com.projectpin.model.GameStartResponse;
import com.projectpin.model.GameStatusResponse;
import com.projectpin.model.GuessRequest;
import com.projectpin.model.GuessResult;
import com.projectpin.service.Game;
import com.projectpin.service.GameService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }
    // TODO: Add these three endpoints:

    // POST /api/game/start
    @PostMapping("/start")
    public GameStartResponse startGame() {
        // Call gameService.createGame()
        String gameId = gameService.createGame();
        return new GameStartResponse(gameId, "Game Started successfully");
    }

    // POST /api/game/{id}/guess
    @PostMapping("/{id}/guess")
    public GuessResult makeGuess(@PathVariable String id, @RequestBody GuessRequest request) {
        // Call gameService.makeGuess(id, guess)
        GuessResult result = gameService.makeGuess(id, request.getGuess());
        // Return the result
        return result;
    }

    // GET /api/game/{id}
    @GetMapping("/{id}")
    public GameStatusResponse getGameStatus(@PathVariable String id) {
        // Call gameService.getGame(id)
        Game game = gameService.getGame(id);
        // Return game info
        return new GameStatusResponse(id, game.getAttempts(), game.isWon(), game.getGuessHistory());
    }
}
