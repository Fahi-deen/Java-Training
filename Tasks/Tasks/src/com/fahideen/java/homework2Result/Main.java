package com.fahideen.java.homework2Result;
import com.fahideen.java.addition.Addtion;
import com.fahideen.java.areaOfCircle.AreaOfCircle;
import com.fahideen.java.areaOfTriangle.AreaOfTriangle;
import com.fahideen.java.cube.Cube;
import com.fahideen.java.division.Division;
import com.fahideen.java.modulo.Modulo;
import com.fahideen.java.multiplication.Multiplication;
import com.fahideen.java.percentage.Percentage;
import com.fahideen.java.square.Square;
import com.fahideen.java.substraction.Substraction;

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
