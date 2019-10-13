class Hostel{
	public static void main(String args[]){
	//Intialiszing values
	int parkingyes,wifiyes,foodyes,hotwater;
	parkingyes = 1;
	wifiyes = 0;
	foodyes = 1;
	hotwater = 1;
	
	System.out.println("Girls Hostel");
	
	//checking condition
	if(parkingyes == 1)
		System.out.println("Parking is available");
	else
		System.out.println("Parking is not available");

	if(wifiyes == 1)
		System.out.println("Wifi is available");
	else
		System.out.println("Wifi is not available");

	if(foodyes == 1)
		System.out.println("Food is available");
	else
		System.out.println("Food is not available");

	if(hotwater == 1)
		System.out.println("Hotwater is available");
	else
		System.out.println("Hotwater is not available");

	}
}