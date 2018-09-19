import java.util.*;
import java.lang.*;
public class Computing_Distance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first x valve point?: ");
		double num1 = sc.nextDouble();
		System.out.print("What is your first y valve point?: " );
		double num2 = sc.nextDouble();
		System.out.println("\n\t\tYour first point is (" + num1 + "," + num2 + ")");
		System.out.print("\nWhat is your second x valve point?: " );
		double num3 = sc.nextDouble();
		System.out.print("What is your second y valve point?: " );
		double num4 = sc.nextDouble();
		System.out.println("\n\t\tYour second point is (" + num3 + "," + num4 + ")");
		double num5 = Math.sqrt(((num1-num3)*(num1-num3)) + ((num2-num4)*(num2-num4)));
		System.out.println("\n\t\t\tThe distance between the point (" + num1 + "," +  num2 + ")and ("
		+ num3 + "," + num4 + ") is " + num5 +".\n");
	}}