/*1.  Write the syntax for declaring a two-dimensional array.
int num [][] = {{1,2,3,4},{2,4,6,8},{3,6,9,12},{4,8,12,16},{5,10,15,20},{6,12,18,24},{7,14,21,28}};

2.  Write the syntax to to declare a two-dimensional array variable matrix of int values.
int num [][] = new int [10][10];

3.  Write a program that grades multiple-choice test for eight students and ten questions,
and the answers are stored in a two-dimensional array.
Each row records a student's answers to the questions.
The below code will be the just only problem 3.(if you want to run it, remove the quotes marks and
add quotes marks on the other program)*/

import java.util.*;
public class HW2{
	/*public static void main(String [] args){
		//declaring stuff
		Scanner sc = new Scanner(System.in);
		int [][] scores = new int [8][10];
		int [] answers = new int [10];

		//Entering the answers for the quiz
		System.out.print("Enter the answers for the quiz: ");
		for(int i = 0; i < 8; i++){
			answers[i] = sc.nextInt();
		}


		//Entering the students answers
		for(int i = 0; i < 8; i++){
			System.out.print("Enter the " + (i+1) + " student's responses for the quiz: ");
			for(int j = 0; j < 10; j++){
				scores[i][j] = sc.nextInt();
			}
		}
		//Grading the quiz
		int r = 0;
		for(int i = 0 ; i < 8; i++){
			for(int j = 0; j < 10; j++){
				if(answers[j] == scores[i][j]){
					r++;
				}
			}
			System.out.println("Student " + (i+1) + " have " + r + " answers right.");
			r = 0;
		}
	}
}*/

/*4.  Write the syntax that declares a three-dimensional array variable scores,
creates an array,
and assigns its reference to scores.
		double [][][] = new double [1][2][3];
		x.length = 1
		x[0].length = 2
		x[0][0].length && x[0][1].length &&
		x[1][0].length && x[1][1].length= 3


5.  Write a program using arrays that can guess your birthdate */

	public static void main(String [] args){
		int day = 0; // Day to be determined
		 int answer;
		 int[][][] dates = {
		 {{ 1, 3, 5, 7}, { 9, 11, 13, 15},{17, 19, 21, 23},{25, 27, 29, 31}}, //First guess

		 {{ 2, 3, 6, 7},{10, 11, 14, 15},{18, 19, 22, 23},{26, 27, 30, 31}}, //Second guess

		 {{ 4, 5, 6, 7},{12, 13, 14, 15},{20, 21, 22, 23},{28, 29, 30, 31}},//Third guess

		 {{ 8, 9, 10, 11},{12, 13, 14, 15},{24, 25, 26, 27},{28, 29, 30, 31}},//Fourth guess

         {{16, 17, 18, 19},{20, 21, 22, 23},{24, 25, 26, 27},{28, 29, 30, 31}}}; //Last guess

 		// Create a Scanner
		  Scanner input = new Scanner(System.in);
		  for (int i = 0; i < 5; i++) {
		 	 System.out.println("Is your birth day in Set" + (i + 1) + "?");
		 	 for (int j = 0; j < 4; j++) {
		  		for (int k = 0; k < 4; k++)
		  			System.out.printf("\t" + dates[i][j][k]);
		  			System.out.println();
				  } //Priting the list.
		 		 System.out.print("\nEnter 0 for No and 1 for Yes: ");
		 		 answer = input.nextInt();
		  		 if (answer == 1)
					  day += dates[i][0][0]; // adding 1,2,4,8,and 16 with combinations.
		 	 }
		 	 System.out.println("Your birth day is " + day);
		  }
}

