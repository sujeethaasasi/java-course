// Write a program to get user input for array and print.

import java.util.Scanner;
class Arrayuser{

	public static void main(String args[]){

		int row=0,col=0;

		Scanner obj= new Scanner(System.in);

		System.out.print("Enter the number of row ");
		row=obj.nextInt();
		System.out.print("Enter the number of col ");
		col=obj.nextInt();
		
		System.out.println("Enter the values for array");

		int array[][] = new int[row][col];

		for(int i=0;i<row;i++)
		{
				for(int j=0;j<col;j++)
				{

				array[i][j]=obj.nextInt();
					
				}			
		}
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+array[i][j]);
			}
			System.out.println(" ");
		}

	}
}

