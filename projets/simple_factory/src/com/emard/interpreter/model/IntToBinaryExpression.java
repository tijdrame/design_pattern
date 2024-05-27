package com.emard.interpreter.model;

import com.emard.interpreter.interf.Expression;

public class IntToBinaryExpression
        implements Expression {
    private int i;
    public IntToBinaryExpression(int i) {
        this.i = i;
    }
    @Override
    public String interpreter(
            InterpreterContext context) {
        return context.getBinaryFormat(i);
    }
}
