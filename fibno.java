// write a fibno serious for a user input number

import java.util.Scanner;

class fibno{
	public static void main(String args[]){

		int i,j,input,k=1,fibno;

		Scanner obj=new Scanner(System.in);

		System.out.println("Enther the user input");
		
		input=obj.nextInt();

		// for(i=0;i<=input;i++)
			for (j=0;j<=input;j++)
		{
			System.out.print(" "+j);

				fibno=j+k;
				
				j=k;

				k=fibno;

				// j=i;

				// System.out.println("Value of i" +i);
		}



		}

	}
