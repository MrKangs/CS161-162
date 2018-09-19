import java.lang.*;
import java.util.*;
public class Recursive{
	public static void power(int x, int y) {
		if (y == 0) {
			System.out.println("\tyour y is 0. \n\t\t\t\t\tI can't do the math!!!");
		} else {
			System.out.println("\t\t\t\t\tYour value is " +  Math.pow(x,y) + " \nwhen your x is " + x + " and your y is " + y + ".");
			power(x, y - 1);
		}}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t\t x^(y) when y>0");
		System.out.print("\tWhat is your x value when x^(y)?: ");
			int x = sc.nextInt();
		System.out.print("\tWhat is your y value? when x^(y): ");
			int y = sc.nextInt();
		power(x,y);
	}}
