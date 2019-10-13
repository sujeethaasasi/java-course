import java.util.Scanner;
class greater4{
	public static void main(String[] args) {

		int a,b,c,d;
		System.out.println("Enter the value for a,b,c,d");

		Scanner obj=new Scanner(System.in);

		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		d=obj.nextInt();

		if (a>=b)
			{
				if ( a>=c)
				{
					if (a>=d)
						System.out.println("A is greater");
					else

						System.out.print("D is greater");
				}
				else
				{
					if (c>=d)

						System.out.println("c is greater");
					else
						System.out.println("D is greater");
				}	
			}	
		else
			{
				if(b>=c)
				{
					if(b>=d)
						System.out.println("B is greate");
					else
						System.out.println("D is greate");
				}
				else
				{
					if (c>=d)

						System.out.println("c is greater");
					else
						System.out.println("D is greater");
				}	
			}
					
	}		
}
