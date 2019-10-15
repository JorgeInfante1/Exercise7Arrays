package com.exercise7arrays.app;

import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) {
		// Variable declaration
		int primeNumber=0;
		char answer='y';
		//Object declaration
		Scanner input=new Scanner(System.in);
		
		do {
			
			System.out.println("Input a number to see if it's prime: ");
			primeNumber=input.nextInt();
			
			if(primeNumber%2==0)
			{
				System.out.println("It's not a prime number");
			}
			else 
			{
				System.out.println("It's a prime number");
			}
			
			System.out.println("Would you like to input anothere number (y/n): ");
			answer=input.next().charAt(0);
			
		}while(answer=='y');
		

	}

}
