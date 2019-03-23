package com.patterns.prototype;

import java.util.List;
import java.util.ArrayList;

public class StatementDemo {

  public static void main(String[] args) {
    // Ejemplo de una copia superficial
    String sql = "select * from movies where title = ?";
    
    List<String> parameters = new ArrayList<>();
    
    parameters.add("Star wars");
    
    Record record = new Record();
    
    Statement firstStatement = new Statement(sql, parameters, record);
    
    System.out.println(firstStatement.getSql());
    
    System.out.println(firstStatement.getParameters());
    
    System.out.println(firstStatement.getRecord());
    
    Statement secondStatement = firstStatement.clone();
    
    System.out.println(secondStatement.getSql());
    
    System.out.println(secondStatement.getParameters());
    
    System.out.println(secondStatement.getRecord());    
  }
}
