package com.fahideen.Comparator;

public class Student {
	 String name;
	 int rollNo;
	 int rank;

	public Student(String name, int rollNo, int rank) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", rank=" + rank + "]";
	}



}
