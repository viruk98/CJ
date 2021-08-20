package com.july02.inheritance;

import java.util.Scanner;

public class BookTicket {

	public static void main(String[] args) {
		boolean bookTicket=false;
		float ticketPrice=0.0f;
		System.out.println("welcome to railways");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter you name");
		String name=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter your source");
		String source=sc.next();
		System.out.println("enter your destination");
		String dest=sc.next();
		System.out.println("enter your distance");
		
		int distance=sc.nextInt();
		System.out.println("enter the type of ticket");
		String type=sc.next();
		if(age>=18 || type.equalsIgnoreCase("p")) {
			
			bookTicket=true;
			int amount=distance*45;
			System.out.println("ticket has been booked :"+name);
		}
		else 
			System.out.println("ticket has not booked :"+name);
	}
}
