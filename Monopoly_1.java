//Monopoly game
import java.util.Scanner;
class Monopoly_1{
		
	public static int dice,dice1,dice2,roll;
	
	public static void main(String args[]){

		String tableName[]	= {"START","CHENNAI","PARK","TRAIN","JAIL","ELECTRICAL COMPANY","Bangalore","Coffee shop","Community chest","Play ground","Free car parking","Hyderabad","Water board","Go to Start","Goa","Mysore","income tax","Madurai","Beach house","Coimbatore","Go to Jail","Luxury tax","Market","Community chest","Auto stand","Estate","Udupi","Hotel","Coorg","Hubli","Bus station","America","London","Hospital","England","Paris","Bowling court","Europe","Kodaikanal","Clubs"};
		String tableType[]	= {"Add","Buy","PARK","TRAIN","JAIL","ELECTRICAL COMPANY","Bangalore","Coffee shop","Community chest","Play ground","Free car parking","Hyderabad","Water board","Go to Start","Goa","Mysore","income tax","Madurai","Beach house","Coimbatore","Go to Jail","Luxury tax","Market","Community chest","Auto stand","Estate","Udupi","Hotel","Coorg","Hubli","Bus station","America","London","Hospital","England","Paris","Bowling court","Europe","Kodaikanal","Clubs"};
		String tableBuy[]	= {"2000","30000","PARK","TRAIN","JAIL","ELECTRICAL COMPANY","Bangalore","Coffee shop","Community chest","Play ground","Free car parking","Hyderabad","Water board","Go to Start","Goa","Mysore","income tax","Madurai","Beach house","Coimbatore","Go to Jail","Luxury tax","Market","Community chest","Auto stand","Estate","Udupi","Hotel","Coorg","Hubli","Bus station","America","London","Hospital","England","Paris","Bowling court","Europe","Kodaikanal","Clubs"};
		String tableRent[]	= {"2000","1500","PARK","TRAIN","JAIL","ELECTRICAL COMPANY","Bangalore","Coffee shop","Community chest","Play ground","Free car parking","Hyderabad","Water board","Go to Start","Goa","Mysore","income tax","Madurai","Beach house","Coimbatore","Go to Jail","Luxury tax","Market","Community chest","Auto stand","Estate","Udupi","Hotel","Coorg","Hubli","Bus station","America","London","Hospital","England","Paris","Bowling court","Europe","Kodaikanal","Clubs"};
		String playerlist1[]=new String[40];
		String playerlist2[]=new String[40];

		// Table Type - Details
		// Buy - 
		// Rent -
		// Add -
		// Sub -

		int i=1,k=0,l=0;

		String playerName[]=new String[2];

		int currentPointer[] = new int[2];
		currentPointer[0] = 0;
		currentPointer[1] = 0;

		// Monopoly_1 func = new Monopoly_1(); //Creating function to call outside the main function

		// Getting Player's Name

		System.out.println("---------------------------------------------------------------");
		System.out.println("------------------------ Array Details ------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("- Name ---------- Type -------- Buy --------- Rent ------------");

		for(int j=0;j<tableName.length;j++) {
			System.out.print(tableName[j]);
			System.out.print("\t");
			System.out.print(tableType[j]);
			System.out.print("\t");
			System.out.print(tableBuy[j]);
			System.out.print("\t");
			System.out.println(tableRent[j]);
			System.out.println("---------------------------------------------------------------");
			System.out.println();
		}

		playerName[0] = startgame();
		//System.out.println(playerName[0]);
		playerName[1] = startgame();
		// System.out.println(playerName[1]);
		
		int currentTurn = 0;
		currentTurn = 1; // Player 2
		currentTurn = 0; // Player 1

		for(i=1;;)
		{
			
			System.out.println(currentTurn);

			dice1 = p1dice();
			dice2 = p1dice();
			roll= dice1+dice2;

			currentPointer[currentTurn] = currentPointer[currentTurn] + roll;

			// Example
			// Roll = 5
			// Player 1 currentPointer = 20
			// currentPointer = 20 + (Roll) 5
			// currentPointer = 25
			// -------
			// Roll = 5
			// Player 1 currentPointer = 38
			// currentPointer = 38 + (Roll) 5 => 43
			// Check condition => > 40 => 40 - 38 = 2 (3)
			// currentPointer = 3

			/*System.out.println(dice1);
			System.out.println(dice2);
			System.out.println(p1dice);
*/
			if (currentPointer[currentTurn]>39) //if condition to start from 0 if dice value crosses 40
			{
				currentPointer[currentTurn]=currentPointer[currentTurn]-40;
				System.out.println(currentPointer[currentTurn]);
				System.out.println(tableName[currentPointer[currentTurn]]);
			}
			else
			{
				System.out.println(currentPointer[currentTurn]);
				System.out.println(tableName[currentPointer[currentTurn]]);
			}
			
				if (currentTurn==0)
				{
					playerlist1[k]=tableName[currentPointer[currentTurn]];
					k++;
				}
				else
				{
					playerlist2[l]=tableName[currentPointer[currentTurn]];
					l++;	
				}	
			// Code need to come in bottom before for ends
			currentTurn = (currentTurn == 0) ? 1 : 0;
			/*for(int s=0;s<=playerlist1.length-1;s++)  //to print the array of a player
			{
				System.out.print(playerlist1[s]);
				System.out.print("\t");
			}*/		
			System.out.print("Enter 1 to continue & 0 to exit"); //to conitnuew the program or exit the program
			Scanner cont=new Scanner(System.in);
			i=cont.nextInt();
			if(i==0)
			break;
		}
	}

	public static String startgame() {

		System.out.print("Enter the Player Name: ");

		Scanner obj=new Scanner(System.in);
			
		String p1name=obj.nextLine();		
		return p1name;
	}	
	
	public static int p1dice()
	{
		double rand1 = Math.random()*6+1; //Random value for dice 1 & 2 bet 1 to 6
		
		dice=(int)rand1;

		return dice;
	}

}
	
		
