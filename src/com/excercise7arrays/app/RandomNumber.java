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
		/*
		//arrrays declaration 
		int[]miArray1=new int[ELEMENTS_ARRAY];
		//arrays pseudo random numbers
		//by means of random class
		Random randomNumbers=new Random(System.nanoTime());
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
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			//generateNumber=(int)Math.random()+50+50;
			generateNumberInt=(int)(Math.random()*50+50);
			//generateNumberInt = (int)generateNumber;
					System.out.println(generateNumberInt);
			
		}
		}
	}
		

	


