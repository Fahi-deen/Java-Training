package com.finzly.java.division;

import com.finzly.java.variableIntiliazer.VariableIntiliazer;

public class Division {
	public int div() {
		VariableIntiliazer var=new VariableIntiliazer();
		var.setA(10);
		var.setB(2);
	     return var.getA()/var.getB();
	}
}
