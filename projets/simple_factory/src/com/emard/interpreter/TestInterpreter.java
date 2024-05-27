package com.emard.interpreter;

import com.emard.interpreter.interf.Expression;
import com.emard.interpreter.model.IntToBinaryExpression;
import com.emard.interpreter.model.IntToHexExpression;
import com.emard.interpreter.model.InterpreterContext;

public class TestInterpreter {
    public InterpreterContext context;
    public TestInterpreter(InterpreterContext context) {
        this.context = context;
    }
    public static void main(String[] args) {
        String first = "13 in Binary";
        String second = "28 in Hexadecimal";
        TestInterpreter interpreter = new TestInterpreter(new InterpreterContext());
        System.out.println(first+ " = "+ interpreter.interpret(first));
        System.out.println(second+ " = "+ interpreter.interpret(second));
    }
    public String interpret(String str){
        Expression expression = null;
        if(str.contains("Hexadecimal")){
            expression = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }else if(str.contains("Binary")){
            expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }else {
            return str;
        }
        return expression.interpreter(context);
    }

}
