package com.patterns.interpreter;

public class OrExpression implements Expression {
  private Expression expression1 = null;
  private Expression expression2 = null;
  
  public OrExpression(Expression expression1, Expression expression2) {
    this.expression1 = expression1;
    this.expression2 = expression2;
  }
  
  public boolean interpret(String context) {
    return expression1.interpret(context) || expression2.interpret(context);
  }
}
