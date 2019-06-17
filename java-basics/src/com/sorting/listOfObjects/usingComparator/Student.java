package com.sorting.listOfObjects.usingComparator;

//A class whose objects are to be arranged has not to implement  the comparator interface. 
public class Student {

	private int rollNo;
	private String name;
	private int age;
	private String gender;

	// constructor
	public Student(int rollNo, String name, int age, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// getters & setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

//to string
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}