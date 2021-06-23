package com.logical;

import java.util.Scanner;

public class Grades {


	public static void main(String[] args) {
		int count, i;
		float totalMarks = 0, percentage;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number of Subject");
		count = scanner.nextInt();

		System.out.println("Enter Marks of " + count + " Subject");
		for (i = 0; i < count; i++) {
			totalMarks += scanner.nextInt();
		}
		System.out.println("Total Mrks : " + totalMarks);
		
		percentage = (totalMarks / (count));

		//500/
		//
		//
		//
		
		switch ((int) percentage / 10) {
		case 10:System.out.println("Grade :A+");
			break;
		case 9:
			System.out.println("Grade : A");
			break;
	
		case 8:
			System.out.println("Grade : B");
			break;
		case 7:
			System.out.println("Grade : C");
			break;
		case 6:
			System.out.println("Grade : D");
			break;
		case 4:
			System.out.println("Grade : E");
			break;
		default:
				System.out.println("Grade : F");
				break;
		}
	}
}

