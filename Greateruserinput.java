import java.util.Scanner;

class Greateruserinput{
	public static void main(String args[]){

	int a,b;

	System.out.println("Enter the value for A & B");

	Scanner obj = new Scanner(System.in);

	a = obj.nextInt();

	b = obj.nextInt();


	if (a>b)
	{
	System.out.println("A is greater than B ");

	}
		else if (a<b)
		{
		System.out.print("B is greater than A");

		}
		else
		{
		System.out.println("A & B are equal");
		}	
	}
}
