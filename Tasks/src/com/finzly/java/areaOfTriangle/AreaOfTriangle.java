package com.finzly.java.areaOfTriangle;

import com.finzly.java.variableIntiliazer.VariableIntiliazer;

public class AreaOfTriangle {
	public double triangle() {
		VariableIntiliazer var =new VariableIntiliazer();
		var.setA(5);
		var.setB(3);
		double result = (0.5) * var.getA() * var.getB();
		return result;
	}

}
