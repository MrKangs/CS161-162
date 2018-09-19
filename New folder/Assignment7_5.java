/*Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.)*/

import java.util.*;
public class Assignment7_5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
		int counter = 0;
		int [] input = new int[10];
		for(int i = 0; i <10; i++){
			input[i] = sc.nextInt();
		}

		for (int i = 0; i < 9; i++){
			for (int j = i + 1; j < 10; j++){
				if (input[i] == input[j]){
					input[i] =0;
					counter++;
					j = 10;
				}
			}
		}
		System.out.println("The number of distinct number is " + counter);
		System.out.print("The distinct numbers are:");
		for (int i = 0; i < 10; i++){
			if(input[i] != 0){
				System.out.print(" " + input[i]);

			}
		}
		System.out.println();
	}
}

