package com.fahideen.collectionExample;

import java.util.ArrayList;

public class Collection_ex {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(10);
		arr.add(4);
		arr.add(5);
		arr.stream().forEach(i->System.out.println(i));
		System.out.println("--------------------");
		arr.parallelStream().forEach(i->System.out.println(i));
		
	}


}
