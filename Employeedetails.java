import java.util.Scanner;

class Employeedetails{

	public static void main(String[] args) {
		
		int bs,yoe,hra,add,deduct,total;
		String en;

		hra=0;
		add=0;
		deduct=0;
		total=0;

		System.out.println("Enter the employee details"); 

		Scanner obj = new Scanner(System.in); 

		System.out.print("Enter the employee Name : ");

		en= obj.nextLine(); //Employee name input

		System.out.print("Enter the Basic Salary : ");

		bs= obj.nextInt(); //Basic salary inpur

		System.out.print("Enter the year of Exp : ");
		
		yoe=obj.nextInt(); // Year of exp input

		//Checking Basic salary to assign HRA

		// if(bs<5000)
		// 	{
		// 		hra=2500;
		// 	}
		// if(bs>5000)
		// 	{
		// 		hra=500;
		// 	}
		// if(bs>7000)
		// 	{
		// 		hra=1000;	
		// 	}
		// if ( bs>10000)
		// 	{
		// 		hra=1500;
		// 	}

		if(bs > 10000)
		{
			hra = 1500;
		} else {
			if(bs > 7000) {
				hra = 1000;
			} else {
				if(bs > 5000) {
					hra = 500;
				} else {
					hra = 2500;
				}
			}
		}


		//Checking Year of exp to assign add/deduction

		deduct=0;
		add=0;

		if(yoe==0)
		{
			add=100;
		}
		if(yoe>3)
		{
			add=3500;
		}
		if(yoe>5)
		{
			add=2500;
		}
		if(yoe>10)
		{
			deduct=1500;
		}		

//Calculatin total salary

total=bs+hra+add-deduct;

//Printing Employee inputs and final calculation

System.out.println("*****************************************************************");
System.out.println("Employee Name "+en);
System.out.println("Basic Salary  "+bs);
System.out.println("Year of Exp   "+yoe);
System.out.println("*****************************************************************");
System.out.println("Basic Salary  "+bs);
System.out.println("HRA           "+hra);
System.out.println("Addition      "+add);
System.out.println("Deduction     "+deduct);
System.out.println("*****************************************************************");
System.out.println("Total         "+total);

}
}