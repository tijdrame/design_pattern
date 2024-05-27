package com.emard.interpreter.interf;

import com.emard.interpreter.model.InterpreterContext;

public interface Expression {
    String interpreter(InterpreterContext context);
}
