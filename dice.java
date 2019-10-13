// Game:- Get dice from user input & check random input is matching or not and run until matches .Need to find number of occurances.
// i) 1st time (Grand winner)
// ii)2nd & 3rd time(Winner)
//iii)>3(loser)

import java.util.Scanner;

class dice{
	public static void main(String args[]){
		
		int dice,random,i=0;

		Scanner obj=new Scanner(System.in);

		System.out.print("Roll the dice: ");

		dice=obj.nextInt();

		if(dice >0 && dice <=6)
		{

		for(random=0;random!=dice;) //Infinite loop , how to exit from cmd, given random!=0;
		{

		i=i+1;

		double rand = Math.random()*10;

		random=(int)rand;

		if(random >0 && random <=6)
		{

		System.out.println("Random : "+random);

		}
		}
	//How to go to the previous program if it fails
		System.out.println("Number of occurances of random : "+i);
				
				switch (i)
				{

				case 1:
					System.out.println("Grand winner");
					break;
				case 2 :
					System.out.println("Winner");
					break;
				default:
					System.out.println("Loser");
					break;
				}	

		}		
		else
			System.out.print("Enter value is not correct");

		}
} 
