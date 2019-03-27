package com.patterns.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {
  private String data;
  
  public TerminalExpression(String data) {
    this.data = data;
  }
  
  public boolean interpret(String context) {
    StringTokenizer stringContext = new StringTokenizer(context);
    while (stringContext.hasMoreTokens()) {
      String test = stringContext.nextToken();
      if (test.equals(data)) {
        return true;
      }
    }
    
    return false;
  }
}
