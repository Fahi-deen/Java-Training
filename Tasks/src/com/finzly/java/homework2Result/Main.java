package com.finzly.java.homework2Result;
import com.finzly.java.addition.Addtion;
import com.finzly.java.areaOfCircle.AreaOfCircle;
import com.finzly.java.areaOfTriangle.AreaOfTriangle;
import com.finzly.java.cube.Cube;
import com.finzly.java.division.Division;
import com.finzly.java.modulo.Modulo;
import com.finzly.java.multiplication.Multiplication;
import com.finzly.java.percentage.Percentage;
import com.finzly.java.square.Square;
import com.finzly.java.substraction.Substraction;

public class Main {

	public static void main(String[] args) {
		Addtion add=new Addtion();
		Substraction sub=new Substraction();
		Multiplication mul=new Multiplication();
		Division div=new Division();
		Percentage per=new Percentage();
		Square square=new Square();
		Modulo mod=new Modulo();
		Cube cube=new Cube();
		AreaOfTriangle triangle=new AreaOfTriangle();
		AreaOfCircle circle=new AreaOfCircle();
		System.out.println("Addition :" +add.add());
		System.out.println("Substraction :" +sub.sub());
		System.out.println("Multiplication :" + mul.mul());
		System.out.println("Division :" +div.div());
		System.out.println("Percentage :" +per.percentage());
		System.out.println("Square :" +square.square());
		System.out.println("modulo :" +mod.mod());
		System.out.println("Cube :"+cube.cube());
		System.out.println("Triangle :"+triangle.triangle());
		System.out.println("Circle :" +circle.areaOfCircle());

		
	}

}
