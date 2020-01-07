package com.excercise7arrays.app;

public class Arrays2d {

	public static void main(String[] args) {
		//constant
		final int  ROWS=10;
		final int COLS=10;
		
		//variable
		int cont=1;
		
		//ARRAYS
		int[][] matrix = new int [ROWS][COLS];
		
		for (int i=0; i<ROWS; i++)
		{
			for(int j=0; j<COLS; j++)
			{
				matrix[i][j]=cont;
				cont++;
			}
		}
		for(int i=0; i<ROWS; i++)
		{
			for(int j=0; j<COLS; j++)
			{System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
			}
		
	}


