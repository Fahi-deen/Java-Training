package com.fahideen.SpringAOP;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class AuthenticatingAspect {

	@Pointcut("within(com.fahideen.SpringAOP ..*)")
	 public void authenticatingPointcut() {
		
	}
	@Pointcut("within(com.fahideen.SpringAOP.ShoppingCart.*)")
	 public void authorizationPointcut() {
		
	}
  @Before("authenticatingPointcut() || authorizationPointcut()")
  public void authenticate() {
	  System.out.println("Authenticaing the request..");
  }
}
