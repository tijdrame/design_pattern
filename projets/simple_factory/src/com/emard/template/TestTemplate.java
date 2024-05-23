package com.emard.template;

import com.emard.template.models.EndlessRunnerGame;
import com.emard.template.models.FootballGame;
import com.emard.template.models.Game;

public class TestTemplate {
    public static void main(String[] args) {
        Game game = new FootballGame();
        game.play();
        System.out.println("==========");
        game = new EndlessRunnerGame();
        game.play();
    }
}
