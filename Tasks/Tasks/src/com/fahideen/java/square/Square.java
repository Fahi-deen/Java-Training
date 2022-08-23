package com.fahideen.java.square;

import com.fahideen.java.variableIntiliazer.VariableIntiliazer;

public class Square {
	public int square() {
		VariableIntiliazer var=new VariableIntiliazer();
		var.setA(10);
		 return (var.getA() * var.getA());
	}
}
