package com.finzly.java.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> myNumbers=new ArrayList<Integer>();
       myNumbers.add(10);
       myNumbers.add(15);
       myNumbers.add(30);
       myNumbers.add(25);
       Collections.sort(myNumbers);
       Collections.reverse(myNumbers);
       for (Integer i : myNumbers) {
         System.out.println(i);
       
	}

}}
