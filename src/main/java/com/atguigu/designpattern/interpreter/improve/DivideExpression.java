package com.atguigu.designpattern.interpreter.improve;

import java.util.HashMap;

public class DivideExpression extends SymbolExpression {

    public DivideExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) / super.right.interpreter(var);
    }
}
