package com.buildappswithpaulo.com;

import com.buildappswithpaulo.com.controller.ScoreBoard;
import com.buildappswithpaulo.com.model.Balloon;
import com.buildappswithpaulo.com.model.Clown;
import com.buildappswithpaulo.com.model.SquareBaloon;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.println("Balloon Tap Score");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.println("Clown Tap Score");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.println("SwuareBalloon Tap Score");
        scoreBoard.algorithmBase = new SquareBaloon();
        scoreBoard.showScore(10, 5);
    }
}
