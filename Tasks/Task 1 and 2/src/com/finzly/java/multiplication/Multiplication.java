package com.finzly.java.multiplication;

import com.finzly.java.variableIntiliazer.VariableIntiliazer;

public class Multiplication
{
	public int mul() {
		VariableIntiliazer var=new VariableIntiliazer();
		var.setA(10);
		var.setB(2);
	     return var.getA()*var.getB();
		}
}
