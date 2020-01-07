package com.excercise7arrays.app;
import java.util.Random;
public class RandomNumber 
{
	
	public static void main(String[] args) {
		// constant declaration
		
		final int ELEMENTS_ARRAY =10;
		
			
		//Variable declaration
		double generateNumber=0;
		int generateNumberInt=0;
		byte generateNumberByte=0;
		byte evenValues=0;
				byte oddValues=0;
				byte zeroValues=0;
				byte positiveValues=0;
				byte negativeValues=0;
		
		byte[]miArray=new byte [ELEMENTS_ARRAY];
		int[]miArray1=new int[ELEMENTS_ARRAY];
		
		//arrrays declaration 
		
		
		//arrays pseudo random numbers
		//by means of random class
		Random randomNumbers=new Random(System.nanoTime());
		/*
	for(int i=0;i<ELEMENTS_ARRAY;i++){
	    generateNumber=randomNumbers.nextDouble();
	    		System.out.println(generateNumber);
	}
	for(int i=0;i<ELEMENTS_ARRAY;i++)
	{
    generateNumberInt=randomNumbers.nextInt(51)+50; 
    		System.out.println(generateNumberInt);}
	
	}
*/
		//by means of math class
		/*
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			//generateNumber=(int)Math.random()+50+50;
			generateNumberInt=(int)(Math.random()*50+50);
			//generateNumberInt = (int)generateNumber;
					System.out.println(generateNumberInt);
					
			
		}*/
		
		
		for(int i=0;i<miArray1.length;i++)
		{		generateNumberByte=(byte)randomNumbers.nextInt(101);
		System.out.println(generateNumberInt);
		}
		
	//pass 2 process
	for(int i=0;i<ELEMENTS_ARRAY;i++)
	{
		if(miArray1[i]==0)
		{zeroValues++;}
		else if(miArray1[i]%2==1) {
		evenValues+=1;}
		else if(miArray1[i]%2==0) {
			oddValues+=1;}
		else if(miArray1[i]>0)
		{positiveValues+=1;}
		else if(miArray1[i]<0)
		{negativeValues+=1;}
		
		
					
					
					//pass 3 visualitation
		System.out.println("Zeros quantity:"+zeroValues);
		System.out.println("Odd Values:"+oddValues);
		System.out.println("Even Values:"+evenValues);
		System.out.println("Positive Values:"+positiveValues);
		System.out.println("Negative Values:"+negativeValues);
	
	}
	
	//pass 3 visualitation
	}
		

	


