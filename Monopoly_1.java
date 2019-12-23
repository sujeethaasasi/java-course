//Monopoly game
import java.util.Scanner;
class Monopoly_1{
		
	public static int dice,dice1,dice2,roll;
	
	public static void main(String args[]){

		String tableName[]	= {"START","CHENNAI","PARK","TRAIN","JAIL","ELECTRICAL COMPANY","Bangalore","Coffee shop","Community chest","Play ground","Free car parking","Hyderabad","Water board","Go to Start","Goa","Mysore","income tax","Madurai","Beach house","Coimbatore","Go to Jail","Luxury tax","Market","Community chest","Auto stand","Estate","Udupi","Hotel","Coorg","Hubli","Bus station","America","London","Hospital","England","Paris","Bowling court","Europe","Kodaikanal","Clubs"};
		String tableType[]	= {"Add","Place","Bank","Prop","Penalty","Place","Place","Place","Bank","Bank","Free","Place","Buy","Go to Start","place","Place","Bank","Place","Place","Place","Penalty","Bank","BAnk","Add","Bank","Place","Place","Place","Place","Place","Bank","Place","Place","Bank","Place","Place","Place","Place","Place","Bank"};
		String tableBuy[]	= {"0","30000","0","50000","0","40000","45000","30000","0","0","0","30000","35000","0","60000","40000","0","45000","45000","50000","0","0","0","0","0","70000","40000","30000","30000","30000"
		,0,30000,35000,0,40000,45000,40000,50000,35000,0
		String tableRent[]	= {"2000","1500","PARK","TRAIN","JAIL","ELECTRICAL COMPANY","Bangalore","Coffee shop","Community chest","Play ground","Free car parking","Hyderabad","Water board","Go to Start","Goa","Mysore","income tax","Madurai","Beach house","Coimbatore","Go to Jail","Luxury tax","Market","Community chest","Auto stand","Estate","Udupi","Hotel","Coorg","Hubli","Bus station","America","London","Hospital","England","Paris","Bowling court","Europe","Kodaikanal","Clubs"};
		String playerList1[]=new String[40];
		String playerList2[]=new String[40];

		// int playerList[][]=new int[2][5];


		// Table Type - Details
		// Buy - 
		// Rent -
		// Add -
		// Sub -

		int i=1;

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

		playerName[0] = getPlayerName();
		//System.out.println(playerName[0]);
		playerName[1] = getPlayerName();
		// System.out.println(playerName[1]);
		
		int currentTurn = 0;
		currentTurn = 1; // Player 2
		currentTurn = 0; // Player 1

		for(i=1;;)
		{
			
			System.out.println("Player Turn : " + currentTurn);

			dice1 = diceRoll();
			dice2 = diceRoll();
			roll= dice1+dice2;

			// currentPointer[currentTurn] = currentPointer[currentTurn] + roll;
			int rollLocation = currentPointer[currentTurn] + roll;

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
			System.out.println("Dice Number is : " + roll);
			System.out.println("Player Curernt Pointer : " + currentPointer[currentTurn]);
			
			if (rollLocation > tableName.length) //if condition to start from 0 if dice value crosses 40
			{
				currentPointer[currentTurn] = rollLocation-tableName.length;
				System.out.println("Current Roll Location : " + currentPointer[currentTurn]);
				System.out.println("Current Table Name    : " + tableName[currentPointer[currentTurn]]);
			}
			else
			{
				currentPointer[currentTurn] = rollLocation;
				System.out.println("Current Roll Location : " + currentPointer[currentTurn]);
				System.out.println("Current Table Name    : " + tableName[currentPointer[currentTurn]]);
			}
			
			System.out.println("-------------" + "Play " + currentTurn + "-------------");
			if (currentTurn == 0) {
				playerList1[currentPointer[currentTurn]] = tableName[currentPointer[currentTurn]];
				for(int j=0;j<playerList1.length;j++) {
					System.out.print(playerList1[j] + "\t");
				}
			} else {
				playerList2[currentPointer[currentTurn]] = tableName[currentPointer[currentTurn]];
				for(int j=0;j<playerList2.length;j++) {
					System.out.print(playerList2[j] + "\t");
				}
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

			if (i==0)
				break;
		}
	}

	public static String getPlayerName() {

		System.out.print("Enter the Player Name: ");

		Scanner obj=new Scanner(System.in);
			
		String p1name=obj.nextLine();		
		return p1name;
	}	
	
	public static int diceRoll()
	{
		double rand1 = Math.random()*6+1; //Random value for dice 1 & 2 bet 1 to 6
		
		dice=(int)rand1;

		return dice;
	}

}
	
		
