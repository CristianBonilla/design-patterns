package com.patterns.abstractFactory;

import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class AbstractFactoryEveryDayDemo {

  public static void main(String[] args) throws Exception {
    String xml = "<document><body><stack>APPL</stack></body></document>";
    ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());    
    DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder factory = abstractFactory.newDocumentBuilder();
    Document document = factory.parse(bais);
    document.getDocumentElement().normalize();
    
    System.out.println("Root element: " + document.getDocumentElement().getNodeName());
    System.out.println(abstractFactory.getClass());
    System.out.println(factory.getClass());
  }
}
