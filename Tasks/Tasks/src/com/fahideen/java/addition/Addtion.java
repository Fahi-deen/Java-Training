package com.fahideen.java.addition;

import com.fahideen.java.variableIntiliazer.VariableIntiliazer;

public class Addtion
{
	public int add() {
		VariableIntiliazer var=new VariableIntiliazer();
		var.setA(10);
		var.setB(2);
	     return var.getA()+var.getB();
		}
}
