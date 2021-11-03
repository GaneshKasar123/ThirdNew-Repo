package com.csi.core;

import java.util.Scanner;

public class IfElseConcept {
	public static void main(String[] args) {

		System.out.println("Please enter age: ");

		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		if (age >= 45) {
			System.out.println("ELIGIBLE FOR VACCINATION");
		} else {
			System.out.println("NOT ELIGIBLE FOR VACCINATION");
		}
	}
}
