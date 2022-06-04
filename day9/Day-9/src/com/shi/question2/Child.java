package com.shi.question2;

import java.util.Scanner;

class Child extends Parent {
	void method1() {
		System.out.println("Enter a number: ");
	}

	void method4() {
		System.out.println("method4");
	}

	public static void main(String[] args) {
		System.out.println("Enter z: ");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
	}
}

