import java.util.Scanner;

class greaterfor3{
	public static void main(String args[]){

	int a,b,c;

	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter the value for a,b.c");

	a=obj.nextInt();
	b=obj.nextInt();
	c=obj.nextInt();
	
	if (a>b) 
		{
			if(a>c)
				System.out.println("A is greter than B & C");
			else
				System.out.println("C is greater than A & B ");
		}	
	else
		{	
			if(b>c)
				System.out.println("B is greter than A & C");
			else	
				System.out.println("C is greater than A & B");
		}
	}
	}