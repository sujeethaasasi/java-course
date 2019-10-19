//Monopoly game
import java.util.Scanner;
class Monopoly{
		
	public int p1dice1,p1dice2,p1dice,p1dice3,p2dice1,p2dice2,p2dice,p2dice3,buy,p1money,rent,bank;
	
	public String table[]={"START","CHENNAI","PARK","TRAIN","JAIL","ELECTRICAL COMPANY","Bangalore","Coffee shop","Community chest","Play ground","Free car parking","Hyderabad","Water board","Go to Start","Goa","Mysore","income tax","Madurai","Beach house","Coimbatore","Go to Jail","Luxury tax","Market","Community chest","Auto stand","Estate","Udupi","Hotel","Coorg","Hubli","Bus station","America","London","Hospital","England","Paris","Bowling court","Europe","Kodaikanal","Clubs"};
		
	public String p1name,p2name;
	
	public static void main(String args[]){

		int a=0,i=1;

		Monopoly func = new Monopoly(); //Creating function to call outside the main function
		
		for(i=1;;)
		{

		System.out.println("Enter the option");
		System.out.println("press 1 to start the game");
		System.out.println("press 2 for player 1");
		System.out.println("press 3 for player 2");
		System.out.println("press 4 for quit");
		
		Scanner obj=new Scanner(System.in); //user input for game
		
		a=obj.nextInt();
		
		func.gameoption(a);	//function for options	
		
		System.out.print("Enter 1 to continue & 0 to exit");
			
			Scanner cont=new Scanner(System.in);
			i=cont.nextInt();			
			
			if(i==0)
				break;
		/*func.p1dice(a);//Rooling dice for player1
		
		func.p2dice(a);//Rolling dice for player2
		*/
		}
	}

	public void gameoption(int option)
	{
		int dice=0;

		switch (option){
			case 1:
			startgame();
			break;
			case 2:
			p1dice(dice);
			break;
			case 3:
			p2dice(dice);
			break;
			default:
			break;
			}
		}
	public void startgame(){

		System.out.print("Enter the Player 1 Name: ");

		Scanner obj=new Scanner(System.in);
			
			p1name=obj.nextLine();		//Getting Player 1 name

		System.out.print("Enter the Player 2 Name: ");
			p2name=obj.nextLine();		//Getting player 2 name
	}	
	
	public void p1dice(int dice)
	{
		double rand1 = Math.random()*6+1; //Random value for dice 1 & 2 bet 1 to 6
		double rand2 = Math.random()*6+1;

		System.out.println("rand1 "+(int)rand1);
		System.out.println("rand2 "+(int)rand2);
		
		p1dice1=(int)rand1; //typecasting from double to int
		
		p1dice2=(int)rand2;

		p1dice = p1dice1+p1dice2+p1dice3;//adding all dice value

		if (p1dice>39) //if condition to start from 0 if dice value crosses 40
		{
		p1dice=p1dice-40;
		System.out.println(p1dice);
		System.out.println(table[p1dice]);
		}
		else
		{
		System.out.println(p1dice);
		System.out.println(table[p1dice]);
		}
		p1dice3=p1dice;

			switch(p1dice3)
			{
				case 0:
					System.out.println("START");
					p1money=p1money+2000;
					break;
				case 1:
					System.out.println("Chennai");
					System.out.println("pay 30,000 to buy");
					System.out.println("pay 1500 for rent");
					buy=30000;
					rent=1500;
					break;	
				case 2:
					System.out.println("Park");
					System.out.println("pay 100 to bank");
					bank=bank+100;
					p1money=p1money-100;
					break;			
				case 3:
					System.out.println("Train");
					System.out.println("pay 50,000 to buy");
					System.out.println("pay 20,000 for rent");
					buy=50000;
					rent=20000;
					break;
				case 4:
					System.out.println("Jail");
					System.out.println("Lost 1 round");
					break;
				case 5:
					System.out.println("Electric company");
					System.out.println("pay 40,000 to buy");
					System.out.println("pay 10,000 for rent");
					buy=40000;
					rent=10000;
					break;
				case 6:
					System.out.println("Bangalore");
					System.out.println("pay 45,000 to buy");
					System.out.println("pay 2,000 for rent");
					buy=45000;
					rent=2000;
					break;
				case 7:
					System.out.println("Coffee shop");
					System.out.println("pay 30,000 to buy");
					System.out.println("pay 5,000 for rent");
					buy=30000;
					rent=5000;
					break;
				case 8:
					System.out.println("Community chest");
					System.out.println("add 2000 to p1");
					p1money=p1money+2000;
					break;		
				case 9:
					System.out.println("Play ground");
					System.out.println("pay to bank 200");
					bank=bank+200;
					p1money=p1money-200;
					break;
				case 10:
					System.out.println("Free car parking");
					break;
				case 11:
					System.out.println("hyderabad");
					System.out.println("pay 30000 to buy");
					System.out.println("pay 1500 for rent");
					buy=30000;
					rent=1500;
					break;
				case 12:
					System.out.println("Water board");
					System.out.println("pay 35000 to buy");
					System.out.println("pay 15000 for rent");
					buy=35000;
					rent=15000;
					break;
				case 13:
					System.out.println("Go to start");
					p1dice3=0;
					break;
				case 14:
					System.out.println("Mysore");
					System.out.println("pay 40000 to buy");
					System.out.println("pay 2000 for rent");
					buy=40000;
					rent=2000;
					break;		
				case 15:
					System.out.println("income tax");
					System.out.println("pay 200 to bank");
					bank=bank+200;
					p1money=p1money-200;
					break;		
				case 16:
					System.out.println("MAdurai");
					System.out.println("pay 450000 to buy");
					System.out.println("pay 2000 for rent");
					buy=45000;
					rent=2000;
					break;		
				case 17:
					System.out.println("Beach house");
					System.out.println("pay 450000 to buy");
					System.out.println("pay 4000 for rent");
					buy=45000;
					rent=4000;
					break;		
				case 18:
					System.out.println("Coimbatore");
					System.out.println("pay 500000 to buy");
					System.out.println("pay 2500 for rent");
					buy=50000;
					rent=2500;
					break;		
				case 19:
					System.out.println("Go to jail");
					p1dice3=4;
					break;		
				case 20:
					System.out.println("Luxury tax");
					System.out.println("pay 200 to bank");
					bank=bank+200;
					p1money=p1money-200;
					break;		
				case 21:
					System.out.println("Market");
					System.out.println("pay 200 to bank");
					bank=bank+200;
					break;
				case 22:
					System.out.println("Community chest");
					System.out.println("pay 200 to bank");
					p1money=p1money+200;
					break;		
				case 23:
					System.out.println("Auto stand");
					System.out.println("pay 1000 to bank");
					bank=bank+1000;
					p1money=p1money-1000;
					break;		
				case 24:
					System.out.println("Estate");
					System.out.println("pay 700000 to buy");
					System.out.println("pay 30000 for rent");
					buy=70000;
					rent=30000;
					break;
				case 25:
					System.out.println("Udupi");
					System.out.println("pay 40000 to buy");
					System.out.println("pay 2500 for rent");
					buy=40000;
					rent=2500;
					break;
				case 26:
					System.out.println("Hotel");
					System.out.println("pay 30000 to buy");
					System.out.println("pay 1000 for rent");
					buy=30000;
					rent=1000;
					break;
				case 27:
					System.out.println("Hotel");
					System.out.println("pay 30000 to buy");
					System.out.println("pay 10000 for rent");
					buy=30000;
					rent=1000;
					break;
				case 28:
					System.out.println("Coorg");
					System.out.println("pay 30000 to buy");
					System.out.println("pay 3000 for rent");
					buy=30000;
					rent=1000;
					break;					
			}

		}
public void p2dice(int dice)//Repeating p1dice for player 2
	{
		double rand1 = Math.random()*6+1;
		double rand2 = Math.random()*6+1;

		System.out.println("rand1 "+(int)rand1);
		System.out.println("rand2 "+(int)rand2);
		
		p2dice1=(int)rand1;
		
		p2dice2=(int)rand2;

		p2dice = p2dice1+p2dice2+p2dice3;

		if (p2dice>39)
		{
		p1dice=p1dice-40;
		System.out.println(p2dice);
		System.out.println(table[p1dice]);
		}
		else
		{
		System.out.println(p2dice);
		System.out.println(table[p2dice]);
		}
		p2dice3=p1dice;

	}

}


