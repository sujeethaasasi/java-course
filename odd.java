//Print odd numbers and add the odd numbers
import java.util.Scanner;
class odd{
	public static void main(String args[]){

		int input,i,add=0,output=0;

		Scanner obj=new Scanner(System.in);

		System.out.print("Enter the input");

		input=obj.nextInt();

		for(i=0;i<=input;i++) //Looping to run upto input number
		{
			
			add=(i%2); // checking whether modulus(remainder is 0 or not

			if(add==0) 
			{
				System.out.println(i); //Printing the odd values

				output=i+output; // Summing up all odd values
			}

			
		}

		System.out.print("Sum of all odd numbers" + output); //Printing the sum of all odd values
	}
}