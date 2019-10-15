package com.exercise7arrays.app;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		//Variables declaration
		int factorial=0;
		int multiplication=1;
		
		//Object creation
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input a number: ");
		factorial=input.nextInt();
		for(int i=1;i<=factorial;i++)
		{
			multiplication*=i;
		}
		
		System.out.println("El resultado es:"+multiplication);

	}

}
