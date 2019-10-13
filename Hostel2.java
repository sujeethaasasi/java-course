import java.util.Scanner;

class Hostel2{
	public static void main(String args[]){
	//Intialiszing values
	int parking,wifi,food,hotwater;
	//parkingyes = 1;
	//wifiyes = 0;
	//foodyes = 1;
	//hotwater = 1;

	Scanner s = new Scanner(System.in);

	System.out.println("Girls Hostel");

	System.out.print("Enter for parking(1/0) : ");

	parking = s.nextInt();

	System.out.println("Parking value enered: "+parking);

	System.out.print("Enter for wifi (1/0): ");
	
	wifi = s.nextInt();

	System.out.println("wifi value enered: "+wifi);

	System.out.print("Enter for food (1/0): ");
	
	food = s.nextInt();

	System.out.println("Parking value enered: "+food);	

	System.out.print("Enter for hotwater : ");
	
	hotwater = s.nextInt();

	System.out.println("Enter for hotwater(1/0) :" +hotwater);

			
	//checking condition
	if(parking == 1)
		System.out.println("Parking is available");
	else
		System.out.println("Parking is not available");

	if(wifi == 1)
		System.out.println("Wifi is available");
	else
		System.out.println("Wifi is not available");

	if(food == 1)
		System.out.println("Food is available");
	else
		System.out.println("Food is not available");

	if(hotwater == 1)
		System.out.println("Hotwater is available");
	else
		System.out.println("Hotwater is not available");

	}
}