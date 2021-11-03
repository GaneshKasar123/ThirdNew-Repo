package com.csi.core;

import java.util.Scanner;

public class SwitchCaseConcept {
	public static void main(String[] args) {

		System.out.println("\n Please enter any Season:");
		Scanner sc = new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1: System.out.println("SUMMER");
			
			break;
		case 2: System.out.println("RAINEE");
		
		break;
		case 3: System.out.println("WINTER");
		
		break;

		default: System.out.println("INVALID SEASON");
			break;
		}
	}
}
