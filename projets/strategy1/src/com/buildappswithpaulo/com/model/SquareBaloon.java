package com.buildappswithpaulo.com.model;

import com.buildappswithpaulo.com.controller.ScoreAlgorithmBase;

public class SquareBaloon implements ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
