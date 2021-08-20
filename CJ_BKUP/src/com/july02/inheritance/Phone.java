package com.july02.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phone {
  // properties
  private String pname;
  private int qty;
  private double price;
  private double totalPrice;

  
  Phone(String pname, int qty, 
              double price, double totalPrice) {
    this.pname = pname;
    this.qty = qty;
    this.price = price;
    this.totalPrice = totalPrice;
  }

  
  public String getPname() {
    return pname;
  }
  public int getQty() {
    return qty;
  }
  public double getPrice() {
    return price;
  }
  public double getTotalPrice() {
    return totalPrice;
  }

  
  public static void displayFormat() {
    System.out.print(
        "\nName      Quantity    Price   Total Price\n");
  }

  // display
  public void display() {
    System.out.format("%-9s %8d %10.2f %10.2f\n", 
         pname, qty, price, totalPrice);
  }
}

