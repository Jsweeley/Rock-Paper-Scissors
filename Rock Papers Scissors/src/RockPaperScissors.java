//Credit to Simon Forsberg
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Random;
public class RockPaperScissors

//Test 123

{
	public static void main (String[] args) 
	{    
		int cChoice; // variable for computers choice (R/P/S)
		int pChoice = 0; // Holds converted choice (R=1, P=2, S=3)
		int cScore = 0, pScore = 0, tie = 0, rounds = 0; // Initialised variables for score keeping (c = computer, p = player) plus keeps track of number of rounds played
		String loop="yes"; // Starts our loop
		Scanner input = new Scanner(System.in); // Creates scanner object
		Random rgen = new Random();
		JOptionPane.showMessageDialog(null, "Hello, for this exercise we're going to be playing everyone's favourite game, Rock-Paper-Scissors!");

		while (loop.equals("yes")) // This loop keeps our game going only while our string.loop is equal to 'yes'
		{ 
			cChoice=rgen.nextInt(3)+1;
			JOptionPane.showInputDialog("Please make your selection: R - Rock. P - Paper. S - Scissors");
			String hInput = input.nextLine();  // variable for players choice (R/P/S) 
			String hChoice = hInput.toUpperCase(); //Converts to Upper case in case user did not
			if (hChoice.equals("R") || hChoice.equals("P") || hChoice.equals("S")) // Ensures player has entered the correct choice for the game to continue
			{
				JOptionPane.showMessageDialog(null, "");

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
					JOptionPane.showMessageDialog(null, "Tie Game!" + "\n" + "" + "\n" + tie++ + "\n" + rounds++);
				} else      // Accounts for scoring for non-tie scenarios
				{
					if (cChoice==1 && pChoice==3) // Computer picks Rock and player has Scissors - adds point to score and rounds
					{
						JOptionPane.showMessageDialog(null, "Computer picked Rock!" + "\n" + "Rock beats Scissors!" + "\n" + "**Computer Wins!**" + "\n" + "" + "\n" + cScore++ + "\n" + rounds++);
					} 

					if (cChoice==1 && pChoice==2) // Computer picks Rock and player has Paper - adds point to score and rounds
					{
						JOptionPane.showMessageDialog(null, "Computer picked Rock!" + "\n" + "Paper beats Rock!" + "\n" + "**Player Wins!**" + "\n" + "");
						pScore++;
						rounds++;
					} 

					if (cChoice==2 && pChoice==3) // Computer picks Paper and player has Scissors - adds point to score and rounds
					{
						JOptionPane.showMessageDialog(null, "Computer picked Paper!" + "\n" + "Scissors beats Paper!" + "\n" + "**Player Wins!**" + "\n" + "" + "\n" + pScore++ + "\n" + rounds++);
					} 

					if (cChoice==2 && pChoice==1) // Computer picks Paper and player has Rock - adds point to score and rounds
					{
						JOptionPane.showMessageDialog(null, "Computer picked Paper!" + "\n" + "Paper beats Rock!" + "\n" + "**Computer Wins!**" + "\n" + "" + "\n" + cScore++ + "\n" + rounds++);
					} 

					if (cChoice==3 && pChoice==1)  // Computer picks Scissors and player has Rock - adds point to score and rounds
					{
						JOptionPane.showMessageDialog(null, "Computer picked Scissors!" + "\n" + "Rock beats Scissors!" + "\n" + "**Player Wins!**" + "\n" + "" + "\n" + pScore++ + "\n" + rounds++);
					} 

					if (cChoice==3 && pChoice==2) // Computer picks Scissors and player has Paper - adds point to score and rounds
					{
						JOptionPane.showMessageDialog(null, "Computer picked Scissors!" + "\n" + "Scissors beats Paper!" + "\n" + "**Computer Wins!**" + "\n" + "" + "\n" + cScore++ + "\n" + rounds++);
					} 
				}                            
			} else  // end the game
			{
				JOptionPane.showMessageDialog(null, "Sorry, you didn't pick Rock, Paper, or Scissors. The game will end now." + "\n" + "Here are the final scores after " + rounds +" rounds:" + "\n" + "You\tComputer\tTies" + "\n" + " "+ pScore +"\t   " + cScore + "\t\t " + tie);
				loop = "no"; // terminates the while loop keeping the game going
			}
		}  
	}
}
