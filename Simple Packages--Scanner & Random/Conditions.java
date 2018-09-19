import java.util.*;
public class Conditions{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first number?: ");
		double num1 = sc.nextDouble();
		if(num1 < 10){
			System.out.println("Your number is less than 10");
		} else if(num1 == 10){
			System.out.println("Your number is equal to 10");
		} else{
			System.out.println("Your number is bigger than 10");
	}}}