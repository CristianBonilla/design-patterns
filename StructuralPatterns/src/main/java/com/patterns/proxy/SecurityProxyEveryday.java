package com.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxyEveryday implements InvocationHandler {
  private Object object;
  
  private SecurityProxyEveryday(Object object) {
    this.object = object;
  }
  
  public static Object newInstance(Object object) {
    return Proxy.newProxyInstance(
        object.getClass().getClassLoader(), 
        object.getClass().getInterfaces(), 
        new SecurityProxyEveryday(object));
  }
  
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object result;
    try {
      result = method.invoke(object, args);
    } catch (InvocationTargetException e) {
      throw e.getTargetException();
    } catch (Exception e) {
      throw new RuntimeException("unexpected invocation exception: " + 
          e.getMessage());
    }
    
    return result;
  }
}
