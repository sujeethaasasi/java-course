package dice;

import java.util.Scanner;

interface Output{
    void getData();
    void diceInput();
}

abstract class PlayerInput {
     
    int dice;
    int random;
    int betMoney;

    public static int i = 0;

    abstract void playerName();
    abstract void betMoney();
    
    public void setData() {

        if (dice >= 1 || dice <= 12) {

            for (random = 0; random != this.dice; ) {
                i = i + 1;
                random = (int) (Math.random() * 10);
            }
        } else
            System.out.println("Enter the correct Value ( 1 to 6)");
    }

}

class Game extends PlayerInput implements Output {


    public void playerName() {
        Scanner objName = new Scanner(System.in);
        System.out.printf("Enter the Player Name : ");
        String name= objName.nextLine();
    }

    public void diceInput() {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the dice Value 1 : ");
        int dice1 = obj.nextInt();

        System.out.println("Enter the dice Value 2 : ");
        int dice2 = obj.nextInt();
        dice = dice1+dice2;
        System.out.println("Total Dice Valuce : "+ dice);
    }

    public void betMoney(){
        Scanner objMoney = new Scanner(System.in);

        System.out.printf("Enter the Bet Money ");
        betMoney = objMoney.nextInt();

    }

    public void getData() {

        int price=0;
        String status = "null";
        switch (i) {
            case 0:
                System.out.println("Wrong Input");
                break;
            case 1:
                price = this.betMoney * 5;
                status = "Grand Winner";
                break;
            case 2:
                price = this.betMoney * 2;
                status = "Runner";
                break;
            case 3:
                price = this.betMoney;
                status = "Participation";
                break;
            default:
                price = (-this.betMoney);
                status = "Loser";
        }
        System.out.println("No of Occurrences : " + i);
        System.out.println(status);
        System.out.println("Your price money is : " + price);
    }

}

public class DiceMatch {

    public static void main(String[] args) {

        Game objDice = new Game();
        objDice.playerName();
        objDice.diceInput();
        objDice.betMoney();
        objDice.setData();
        objDice.getData();

    }

}