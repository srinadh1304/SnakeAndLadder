package com.bridgelabz.snakeandladder;

public class SnakeAndLadder
{
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder");
		System.out.println("The Player Starts at Position 0");
		int numberOnDie=0,currentPosition1=0,currentPosition2=0;
		boolean player1Turn=true,player2Turn=false,player1=false,player2=false;
		//int count=0;
		while(currentPosition1<100 && currentPosition2<100)
		{
			if(player1Turn)
			{
				System.out.println("Player 1 Turn");
				player1Turn=false;
				numberOnDie=(int)((Math.random()*100)%6)+1;
				//count=count+1;
				System.out.println("The Number on the Die is "+numberOnDie);
				int option=(int)(Math.random()*100)%3;
				switch(option) 
				{
				case NO_PLAY:
					System.out.println("Option is No Play");
					player2Turn=true;
					break;
				case LADDER:
					System.out.println("Option is Ladder");
					currentPosition1=currentPosition1+numberOnDie;
					player1Turn=true;
					break;
				case SNAKE:
					System.out.println("Option is Snake");
					currentPosition1=currentPosition1-numberOnDie;
					player2Turn=true;
					break;

				}
				if(currentPosition1<0) 
				{
					currentPosition1=0;
				}	
				if(currentPosition1>100)
				{
					currentPosition1=currentPosition1-numberOnDie;
				}
				if(currentPosition1==100)
				{
					player1=true;
					break;
				}
				System.out.println("Current Position of Player 1: "+currentPosition1);
			}
			if(player2Turn)
			{
				System.out.println("Player 2 Turn");
				player2Turn=false;
				numberOnDie=(int)((Math.random()*100)%6)+1;
				//count=count+1;
				System.out.println("The Number on the Die is "+numberOnDie);
				int option=(int)(Math.random()*100)%3;
				switch(option) 
				{
				case NO_PLAY:
					System.out.println("Option is No Play");
					player1Turn=true;
					break;
				case LADDER:
					System.out.println("Option is Ladder");
					currentPosition2=currentPosition2+numberOnDie;
					player2Turn=true;
					break;
				case SNAKE:
					System.out.println("Option is Snake");
					currentPosition2=currentPosition2-numberOnDie;
					player1Turn=true;
					break;

				}
				if(currentPosition2<0)
				{
					currentPosition2=0;
				}	
				if(currentPosition2>100)
				{
					currentPosition2=currentPosition2-numberOnDie;
				}
				if(currentPosition2==100)
				{
					player2=true;
					break;
				}
				System.out.println("Current Position of Player 2: "+currentPosition2);
			}
		}
		if(player1)
			System.out.println("The Player 1 has won the game");
		else if(player2)
			System.out.println("The Player 2 has won the game");

	}
}
