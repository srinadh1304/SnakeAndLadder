package com.bridgelabz.snakeandladder;

public class SnakeAndLadder
{
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static void main(String[] args)
	{
		System.out.println("Welcome to Snake and Ladder");
		System.out.println("The Player Starts at Position 0");
		int numberOnDie=0,currentPosition=0;
		while(currentPosition<100)
		{
			numberOnDie=(int)((Math.random()*100)%6)+1;
			System.out.println("The Number on the Die is "+numberOnDie);
			int option=(int)(Math.random()*100)%3;
			switch(option)
			{
				case NO_PLAY:
					System.out.println("Option is No Play");
					break;
				case LADDER:
					System.out.println("Option is Ladder");
					currentPosition=currentPosition+numberOnDie;
					break;
				case SNAKE:
					System.out.println("Option is Snake");
					currentPosition=currentPosition-numberOnDie;
					break;
		
			}
			if(currentPosition<0) 
			{
				currentPosition=0;
			}	
			System.out.println("Current Position "+currentPosition);
		}
		System.out.println("The Player has reached Winning position");
		
		

		}
}
