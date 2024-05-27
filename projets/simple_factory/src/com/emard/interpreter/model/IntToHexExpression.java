package com.emard.interpreter.model;

import com.emard.interpreter.interf.Expression;

public class IntToHexExpression
        implements Expression {
    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }
    @Override
    public String interpreter(
            InterpreterContext context) {
        return context.getHexFormat(i);
    }
}
