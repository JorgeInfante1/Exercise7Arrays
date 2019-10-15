package com.exercise7arrays;

import java.util.Scanner;
public class sumArrays {

	public static void main(String[] args) {
		//Constant declaration
		
		//Variable declaration
		int cont=0;
		//Array declaration
		int[] firstArray=new int[5];
		int[] secondArray=new int[5];
		int[] sumArray=new int[5];
		
		//Object creation
		Scanner input=new Scanner(System.in);
		
		System.out.println("Firts Array ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Digit a number: ");
			firstArray[i]=input.nextInt();
			
		}
		
		System.out.println("Second Array ");
		for(int i=4;i>=0;i--)
		{
			System.out.println("Digit a number: ");
			secondArray[i]=input.nextInt();
			
		}
		
		System.out.println("Final Result");
		for(int i=0;i<5;i++)
		{
			sumArray[i]=firstArray[i]+secondArray[i];
			System.out.print(" "+sumArray[i]);
		}
		
		
		

	}

}
