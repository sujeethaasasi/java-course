import java.util.Scanner;
class forrepeat{
	public static void main(String args[]){

		int i=1;

		for(i=1;;)
		{
			System.out.println("hello");
			System.out.print("Enter 1 to continue & 0 to exit");
			Scanner obj=new Scanner(System.in);
			i=obj.nextInt();			
			if(i==0)
				break;
		}
	}
}