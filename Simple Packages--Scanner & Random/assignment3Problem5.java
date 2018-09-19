import java.util.Scanner;
public class assignment3Problem5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the tempeture in Celsius? :");
		int C = sc.nextInt();
		int BASE = 32;
		double factor = 9.0/5.0;
		double F = (factor*C) + BASE;
		System.out.println("The temperture in Fahrenheit is " + F);
	}
}