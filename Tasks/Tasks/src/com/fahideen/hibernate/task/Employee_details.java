package com.fahideen.hibernate.task;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee_details {
  @Override
	public String toString() {
		return "Employee_details [id=" + id + ", name=" + name + ", salary=" + salary + "]\n ";
	}
@Id
  private int id;
  private String name;
  private int salary;
  public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public Employee_details(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee_details() {
	// TODO Auto-generated constructor stub
}
}
