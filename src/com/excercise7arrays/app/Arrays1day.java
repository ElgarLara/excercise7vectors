package com.excercise7arrays.app;

public class Arrays1day {

	public static void main(String[] args) 
	{
		//cosntat declaration
		//wangt 10 elements , is  practice
		final int ELEMENT_ARRAY = 10;
		// arrays declaration
	
		//1st way
		int[] intArray =new int[10];
		char[]charArray=new char[10];
		boolean[]boolArray =new boolean[10];
		double[]dblArray=new double[10];
		String[]strArray=new String[10];
		
		int[] intArray2= {10,20,30,40,50,60};
		char[]charArray2= {'a','b','c'};
		boolean[]boolArray2= {true, false, true, false};
		double[]dblArray2 = {1.0, 2.0, 3.0};
		String[]strArray2 = {"first", "second", "third"};
		
		for(int i=0;i<intArray2.length;i++)
		{System.out.println(intArray[i]);
			}
		for(int i=0;i<charArray2.length;i++)
		{System.out.println(charArray[i]);
			}	for(int i=0;i<charArray2.length;i++)
			{System.out.println(boolArray[i]);
			}	for(int i=0;i<boolArray2.length;i++)
		{System.out.println(dblArray[i]);
			}	for(int i=0;i<dblArray2.length;i++)
		{System.out.println(strArray[i]);
			}	for(int i=0;i<strArray2.length;i++)
		{System.out.println(intArray[i]);

	}
	}
}
