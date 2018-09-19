import java.util.*;
public class RockPaperScissors1{
	public static void main(String args[]){
	Random rd = new Random();
	Scanner me = new Scanner(System.in);
	boolean okay;
	do{
		int y = rd.nextInt(3);
		System.out.print("Rock is R, Scissors is S, and Paper is P\nRock , Paper, Scissors... Shoot!: ");
		char Cheese = me.next().charAt(0);
		String I = "NO";
		String You = "ERROR";
		switch (y){
			case 0:
			I ="Rock";
			break;
			case 1:
			I = "Paper";
			break;
			case 2:
			I = "Scissors";
			break;
			default:
			System.out.println("I don't know");
			break;
		}


		int x = 3;
		switch (Cheese){
			case 'R': case 'r':
			x = 0;
			You = "Rock";
			break;
			case 'P': case 'p':
			x = 1;
			You = "Paper";
			break;
			case 'S': case 's':
			x = 2;
			You = "Scissors";
			break;
			default:
			System.out.println("Error, REDO");
			break;
		}
		if (x == y){
			System.out.println("The game result is a Draw!");
			System.out.println("You Played " + You + " ,While the computer also played " + I);
		}else if(x != 3){
			switch (y){
			case 1:
			if (y < x){
				System.out.println("YOU WIN");
				System.out.println("You Played " + You + " ,While the Computer Played " + I);
			}else {
				System.out.println("YOU LOSE");
				System.out.println("You Played " + You + " ,While the Computer Played " + I);
			}
			break;
			case 0:
			if ((y + x) % 2 != 0){
				System.out.println("YOU WIN");
				System.out.println("You Played " + You + " ,While the Computer Played " + I);
			}else {
				System.out.println("YOU LOSE");
				System.out.println("You Played " + You + " ,While the Computer Played " + I);
			}
			break;
			case 2:
			if ((y + x) % 2 == 0){
				System.out.println("YOU WIN!");
				System.out.println("You Played " + You + " ,While the Computer Played " + I);
			}else {
				System.out.println("YOU LOSE");
				System.out.println("You Played " + You + " ,While the Computer Played " + I);
			}
			break;
			default:
			System.out.println("WHATTTTTTTT??????");
			break;}
		}else {
			System.out.println();
		}
		System.out.println("Do you want to play again?: \n Yes is y and No is n. ");
		char Again = me.next().charAt(0);
		switch (Again){
			case 'Y': case 'y':
			okay = false;
			System.out.println("Alright, Another round.");
			System.out.println();
			break;
			case 'N': case 'n':
			okay = true;
			System.out.println("Alright, GoodBye");
			System.out.println();
			break;
			default:
			System.out.println("I Guess that is a No sign. GoodBye!");
			System.out.println();
			okay = true;
			break;
			}}while(!okay);

	}}