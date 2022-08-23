package com.finzly.java.areaOfCircle;

import com.finzly.java.variableIntiliazer.VariableIntiliazer;

public class AreaOfCircle {
	public double areaOfCircle() {

		VariableIntiliazer var=new VariableIntiliazer();
		var.setA(2);
		return (3.14 * var.getA() * var.getA());
	}
}
