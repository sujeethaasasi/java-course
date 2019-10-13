// write a program to add,subtract,multiplication by calling function & declaring global variables

import java.util.Scanner;

class Operatormethodglobal{

	public static int total;

	public static void main(String args[]){

		int a , b;

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter for a & b ");

		a=obj.nextInt();

		b=obj.nextInt();


		add(a,b);

		subtract(a,b);

		multiplication(a,b);

	}

	public static void add(int a,int b){
		
		// int total;
		
		total=a;
		
		System.out.println("add: "+total);
		}

	public static void subtract(int a, int b){

		// int total;
		total=a-b;
		System.out.println("subtract: "+total);
		}
	public static void multiplication(int a,int b){
		// int total;
		total=a*b;
		System.out.println("multiplication: "+total);
		}
}
