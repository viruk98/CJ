package com.july02.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Amount {
	  public static void main(String[] args) {
	    
	    String productName = null;
	    int quantity = 0;
	    double price = 0.0;
	    double totalPrice = 0.0;
	    double overAllPrice = 0.0;
	    char choice = '\0';

	    // create Scanner class object
	    Scanner scan = new Scanner(System.in);

	    List<Phone> product = new ArrayList<>();

	    do {
	      // read input values
	      System.out.println("Enter phone details,");
	      System.out.print("Name: ");
	      productName = scan.nextLine();
	      System.out.print("Quantity: ");
	      quantity = scan.nextInt();
	      System.out.print("Price (per item): ");
	      price = scan.nextDouble();

	      // calculate total price for that product
	      totalPrice = price * quantity;

	      // calculate overall price
	      overAllPrice += totalPrice;

	      product.add( new Phone(
	          productName, quantity, price, totalPrice) );

	    
	      System.out.print("Want to add more item? (y or n): ");
	      choice = scan.next().charAt(0);

	      scan.nextLine();
	    } while (choice == 'y' || choice == 'Y');
	    System.out.println("\nTotal Price = " + overAllPrice);
	  }
	}