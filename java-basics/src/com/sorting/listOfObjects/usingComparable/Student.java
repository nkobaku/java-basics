package com.sorting.listOfObjects.usingComparable;

//Creating a Student class which implements Comparable Interface  
public class Student implements Comparable<Student> {

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

	// we can sort the collection on the basis of a single element such as rollNo,
	// name, gender and age.

	// 1. By age
	@Override
	public int compareTo(Student student) {
		if (this.age == student.age) {
			return 0;
		} else if (age > student.age) {
			return 1;
		} else {
			return -1;
		}
	}

//to string
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}