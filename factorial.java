//Write a program to get factorial for a given number
import java.util.Scanner;

class factorial{
	public static void main(String args[]){

		int i,factorial,input;
		factorial=1;

		Scanner obj=new Scanner(System.in);

		System.out.println("Enter the inpur to calculate factorial");
		
		input=obj.nextInt();

		for(i=1;i<=input;i++)
		{
			factorial=(i*factorial);
		}
	
		System.out.print("Factorial value is "+factorial);

	}
}