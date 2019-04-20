package com.patterns.proxy;

import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

public class SecurityProxy implements InvocationHandler {
  private Object object;
  
  public SecurityProxy(Object object) {
    this.object = object;
  }
  
  public static Object newInstance(Object object) {
    return Proxy.newProxyInstance(object.getClass().getClassLoader(), 
        object.getClass().getInterfaces(), new SecurityProxy(object)); 
  }
  
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    try {
      Object result = method.invoke(object, args);      
      return result;
    } catch (InvocationTargetException e) {
      throw e.getTargetException();
    } catch (Exception e) {
      throw new RuntimeException("unexpected invocation exception: " + 
          e.getMessage());
    }    
  }
}
