package com.fahideen.Springboot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(scopeName = "prototype")
public class Doctor implements Staff {
	

public void assist() {
	  System.out.println("Doctor is Assisting");
  }
}
