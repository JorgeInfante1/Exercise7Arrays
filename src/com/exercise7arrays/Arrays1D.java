package com.exercise7arrays;

import java.util.Random;
public class Arrays1D 
{

	public static void main(String[] args) 
	{
		//Constant Declaration
		final int ELEMENTS_ARRAY=100;
		//Variables Declaration
		double generatedNumber=0;
		int generatedNumberInt=0;
		byte generatedNumberByte=0;
		
		byte evenValues=0;
		byte oddValues=0;
		byte zeroValues=0;
		byte positiveValues=0;
		//Arrays declaration
		byte[] myArray1=new byte[ELEMENTS_ARRAY];
		
		//Array pseudo random numbers
		//Way 1 by means of Random Class
		Random randomNumbers=new Random(System.currentTimeMillis());//Or System.nanoTime()
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			
			generatedNumber=randomNumbers.nextDouble();
			System.out.println(generatedNumber);
		}
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			
			generatedNumberInt=randomNumbers.nextInt(51)+50;
			System.out.println(generatedNumberInt);
		}
		//Way 2 by means of Math Class
		
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			generatedNumberInt=(int) (Math.random()*51+50);
			//generatedNumberInt=(int) generatedNumber;
			System.out.println(generatedNumberInt);
		}
		
		//Pass 1 Initialize
		for(int i=0;i<myArray1.length;i++)
		{
			generatedNumberByte= (byte) randomNumbers.nextInt(101);
			System.out.println(generatedNumberInt);
			myArray1[i]=generatedNumberByte;
		}
		
		//Pass 2 Process
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			
			if(myArray1[i]==0)
			{
				zeroValues++;
			}
			else if(myArray1[i]%2==0)
			{
				evenValues++;
				
			}
			else if(myArray1[i]%2==1)
			{
				
				oddValues++;
			}
			else if(myArray1[i]>0)
			{
				positiveValues++;
				
			}
		}
		
		//Pass 3 Visualization
		System.out.println("Zeros Quantity: "+zeroValues);
		System.out.println("Odd Values: "+zeroValues);
		System.out.println("Even Values: "+zeroValues);
		System.out.println("Positive Values: "+zeroValues);

	}

}
