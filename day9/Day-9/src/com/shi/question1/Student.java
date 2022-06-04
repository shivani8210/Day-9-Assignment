package com.shi.question1;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {
		
	}
	
	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	
	public void displayDetails() {
		System.out.println("Enter student details");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Roll: ");
		int roll = scanner.nextInt();
		System.out.println("Name: ");
		String name = scanner.next();
		System.out.println("Marks: ");
		int marks = scanner.nextInt();
		Student s1 = new Student(roll, name, marks, grade);
		System.out.println(s1);
		System.out.println("Grade: " + calculateGrade(marks));
	}
	
	@Override
	public String toString() {
		return "Student\nroll=" + roll + "\nname=" + name + "\nmarks=" + marks; 
	}
	
	private char calculateGrade(int marks) {
		if (marks >= 500)
			grade = 'A';
		else if (marks < 500 && marks >= 400)
			grade = 'C';
		return grade;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
}
