/*Write a program that reads in two integers base and exp
and uses a recursive power method to compute the first raised to the second power.
Name the file power.java.*/

import java.util.*;
public class power{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base: ");
		int base = sc.nextInt();
		System.out.print("Enter the power: ");
		int P = sc.nextInt();

		power Power = new power();

		System.out.println("The result is " +
		Power.getResult(base, P));

	}

	public int getResult(int x , int y){
		if (y == 0) return 1;
		else return ( x * getResult(x, y-1));
	}
}
