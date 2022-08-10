package com.finzly.arithmetricOperations;

public class Ten_Operations {


	void add(int a, int b) {
     System.out.println("Addition :" + (a+b));
	}

	void sub(int a, int b) {
		 System.out.println("Subtraction :" + (a-b));
	}

	void mul(int a, int b) {
		 System.out.println("Multiplication :"+ (a*b));
	}

	void div(int a, int b) {
		 System.out.println("Multiplication :"+ (a/b));
	}

	void mod(int a, int b) {
		 System.out.println("Remainder :"+ (a%b));
	}

	void square(int a) {
		 System.out.println("Square :"+ (a*a));
	}

	void cube(int a) {
		 System.out.println("cube :"+ (a*a*a));
	}

	void areaOfCircle(double r) {

		double result = 3.14 * r * r;
		System.out.println("Area of circle is :" + result);
	}

	void percentage(double val, double total) {
		double percentage = (val / total) * 100;
		System.out.println("Percentage " + percentage);

	}

	void triangle(double b, double h) {
		System.out.println("Area of triangle is :" + (0.5) * b * h);
	}

	public static void main(String[] args) {
		Ten_Operations operations=new Ten_Operations();
		operations.add(10, 3);
		operations.sub(10, 3);
		operations.mul(10,5);
		operations.div(10, 5);
		operations.mod(10, 5);
		operations.square(10);
		operations.cube(10);
		operations.areaOfCircle(10);
		operations.percentage(25,50);
		operations.triangle(10, 5);

	}

}
