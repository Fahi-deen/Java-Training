package com.finzly.java.percentage;


import java.text.DecimalFormat;

import com.finzly.java.variableIntiliazer.VariableIntiliazer;

public class Percentage {
	public double percentage() {
		VariableIntiliazer var=new VariableIntiliazer();
		var.setA(50);
		var.setB(75);
		double result=((double)var.getA() /(double)var.getB()) *100.0;
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
	     return  Double.parseDouble(df.format(result));

	}
}
