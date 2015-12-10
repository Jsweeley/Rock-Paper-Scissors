//Credit to Simon Forsberg
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors

//Test 123
//Dean's Test
//Zach's Test

{
	public static void main (String[] args) 
	{    
		int cChoice; // variable for computers choice (R/P/S)
		int pChoice = 0; // Holds converted choice (R=1, P=2, S=3)
		int cScore = 0, pScore = 0, tie = 0, rounds = 0; // Initialised variables for score keeping (c = computer, p = player) plus keeps track of number of rounds played
		String loop="yes"; // Starts our loop
		Scanner input = new Scanner(System.in); // Creates scanner object
		Random rgen = new Random();
		System.out.println("Hello, for this exercise we're going to be playing everyone's favourite game, Rock-Paper-Scissors!");

		while (loop.equals("yes")) // This loop keeps our game going only while our string.loop is equal to 'yes'
		{ 
			cChoice=rgen.nextInt(3)+1;
			System.out.println("Please make your selection: R - Rock. P - Paper. S - Scissors");
			String hInput = input.nextLine();  // variable for players choice (R/P/S) 
			String hChoice = hInput.toUpperCase(); //Converts to Upper case in case user did not
			if (hChoice.equals("R") || hChoice.equals("P") || hChoice.equals("S")) // Ensures player has entered the correct choice for the game to continue
			{
				System.out.println("");

				if (hChoice.equals("R"))  // This converts pChoice to the numeric value for "Rock"
				{
					pChoice = 1;
				}
				if (hChoice.equals("P"))  // This converts pChoice to the numeric value for "Rock"
				{
					pChoice = 2;
				}
				if (hChoice.equals("S"))  // This converts pChoice to the numeric value for "Rock"
				{
					pChoice = 3;
				}

				if (pChoice == cChoice) // Takes care of Ties
				{ 
					System.out.println("Tie Game!");
					System.out.println("");
					tie++;
					rounds++;
				} else      // Accounts for scoring for non-tie scenarios
				{
					if (cChoice==1 && pChoice==3) // Computer picks Rock and player has Scissors - adds point to score and rounds
					{
						System.out.println("Computer picked Rock!");
						System.out.println("Rock beats Scissors!");
						System.out.println("**Computer Wins!**");
						System.out.println("");
						cScore++;
						rounds++;
					} 

					if (cChoice==1 && pChoice==2) // Computer picks Rock and player has Paper - adds point to score and rounds
					{
						System.out.println("Computer picked Rock!");
						System.out.println("Paper beats Rock!");
						System.out.println("**Player Wins!**");
						System.out.println("");
						pScore++;
						rounds++;
					} 

					if (cChoice==2 && pChoice==3) // Computer picks Paper and player has Scissors - adds point to score and rounds
					{
						System.out.println("Computer picked Paper!");
						System.out.println("Scissors beats Paper!");
						System.out.println("**Player Wins!**");
						System.out.println("");
						pScore++;
						rounds++;
					} 

					if (cChoice==2 && pChoice==1) // Computer picks Paper and player has Rock - adds point to score and rounds
					{
						System.out.println("Computer picked Paper!");
						System.out.println("Paper beats Rock!");
						System.out.println("**Computer Wins!**");
						System.out.println("");
						cScore++;
						rounds++;
					} 

					if (cChoice==3 && pChoice==1)  // Computer picks Scissors and player has Rock - adds point to score and rounds
					{
						System.out.println("Computer picked Scissors!");
						System.out.println("Rock beats Scissors!");
						System.out.println("**Player Wins!**");
						System.out.println("");
						pScore++;
						rounds++;
					} 

					if (cChoice==3 && pChoice==2) // Computer picks Scissors and player has Paper - adds point to score and rounds
					{
						System.out.println("Computer picked Scissors!");
						System.out.println("Scissors beats Paper!");
						System.out.println("**Computer Wins!**");
						System.out.println("");
						cScore++;
						rounds++;
					} 
				}                            
			} else  // end the game
			{
				System.out.println ("Sorry, you didn't pick Rock, Paper, or Scissors. The game will end now.");
				System.out.println ("Here are the final scores after " + rounds +" rounds:");
				System.out.println ("You\tComputer\tTies");
				System.out.println (" "+ pScore +"\t   " + cScore + "\t\t " + tie);
				loop = "no"; // terminates the while loop keeping the game going
			}
		}  
	}
}
