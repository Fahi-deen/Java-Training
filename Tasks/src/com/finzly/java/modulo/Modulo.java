package com.finzly.java.modulo;

import com.finzly.java.variableIntiliazer.VariableIntiliazer;

public class Modulo {
	public int mod() {
		VariableIntiliazer var=new VariableIntiliazer();
		var.setA(10);
		var.setB(3);
	     return var.getA()%var.getB();
	}
}
