// write a multiplication table
import java.util.Scanner;

class multiplication{

	public static void main(String args[]){

	int table,upto,i=0,multi;

	Scanner obj = new Scanner(System.in);

	System.out.print(" Enter the number ");

	table = obj.nextInt();

	Scanner input = new Scanner(System.in);

	System.out.print("Enter upto which table is required ");

	upto=input.nextInt();

	for(i=0;i<=upto;i++)
	{
		multi=i*table;

		System.out.println(i + "*" + table + "=" +multi);

	}

	}


}