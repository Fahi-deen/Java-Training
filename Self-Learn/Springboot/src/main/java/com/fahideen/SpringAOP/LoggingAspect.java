package com.fahideen.SpringAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* com.fahideen.SpringAOP.ShoppingCart.checkOut())")
	public void beforeloggers() {
		System.out.println("Before Loggers..");
	}
    //@After("execution(* *.*.checkOut())")
	//first * for return type
	//second * for package
	//third * for class
	@After("execution(* com.fahideen.SpringAOP.ShoppingCart.checkOut())")
	public void Afterloggers() {
		System.out.println("After Loggers..");
	}

}
