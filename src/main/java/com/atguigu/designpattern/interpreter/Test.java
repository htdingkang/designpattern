package com.atguigu.designpattern.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("10 * (2 + 1) / 2 + 66");
        Integer value = (Integer) expression.getValue();
        System.out.println(value);
    }
}
