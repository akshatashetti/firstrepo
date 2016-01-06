package online;

import java.util.Scanner;

public class Mainm {

	public static void main(String args[])
	{
		
		Item i1=new Item("g2");
		Payment p=new Payment();
		
		
		i1.setPrice(200.00);
		//String name=i1.getName();
		double price=i1.getPrice();
		
		//System.out.println("name of item ="+name);
		//System.out.println("price of the item"+name+"is"+price);
		
		int ch;
		//do{
		System.out.println("choose the method of payment");
		System.out.println(" debit card press 1");
		System.out.println("credit card press 2");
		System.out.println("netbanking card press 3");
		System.out.println("cash press 4");
		
		  Scanner s = new Scanner(System.in); 
		  int choice = s.nextInt();
		  
		  switch(choice)
		  {
		  case 1:System.out.println("price of the item"+price);
			  p.payDebit();
		  
		         break;
		  case 2:
			  p.payCredit();
			  System.out.println("price of the item"+price);
		         break;
		  case 3:p.payNet();
		         break;
		  case 4:System.out.println("price of the item"+price);
			  p.payCash();
		         break;
		   default:System.out.println("choose method");
		  
		  }
		 // System.out.println("do u want to continue press 0");
		 // ch=s.nextInt();
		//}while(ch == 999);
		
	}

}
