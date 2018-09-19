 /*Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.*/

import java.util.*;
public class Assignment7_4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the scores you have:");
		int counter =0;
		int sum = 0;
		int avg;
		int above = 0;
		int below = 0;
		int [] Numscore = new int[999999];
		for(int i = 0; i < 999999; i++){
			int score = sc.nextInt();
			if(score < 0){
				i = 999999;
			}
			else if(score > 100){
				i--;
			}
			else{
				Numscore[i] = score;
				sum += Numscore[i];
				counter++;
			}

		}
		if(counter != 0){
			avg = sum / counter;
			for (int i = 0; i < 999999; i++){
				if(Numscore[i] != 0 && Numscore[i] >= avg){
					above++;
				}else if (Numscore[i] != 0 && Numscore[i] < avg){
					below++;
				}
			}
		System.out.println("The average of the number is " + avg + " ." +
		" \nThere are " + above + " score that is above the average or equal to the average \nand "
		+ below + " score that is below the average");

		}


	}
}