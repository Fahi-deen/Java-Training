package com.fahideen.java.cube;

import com.fahideen.java.variableIntiliazer.VariableIntiliazer;

public class Cube {
	public int cube() {
		VariableIntiliazer var=new VariableIntiliazer();
		var.setA(10);
		 return (var.getA() * var.getA() * var.getA());
	}
}
