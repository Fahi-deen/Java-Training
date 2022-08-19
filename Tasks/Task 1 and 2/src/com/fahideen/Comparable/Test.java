package com.fahideen.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
public static void main(String[] args) 
{
	ArrayList<Student> stu_List=new ArrayList<>();
	stu_List.add(new Student("Seeni",1,3));
	stu_List.add(new Student("Hameed",2,22));
	stu_List.add(new Student("Fahideen",3,11));
	stu_List.add(new Student("Arjun",4,1));
	stu_List.add(new Student("Revanth",5,2));
	
	Collections.sort(stu_List);
	for(Student s:stu_List) {
		System.out.println(s);
	}
}


}
