import java.util.*;
public class Die{
	public static void main(String args[]){
		Random rd = new Random();
		int num1 = rd.nextInt(6)+1;
		int num2 = rd.nextInt(6)+1;
		System.out.println("The first die result is " + num1 + " and the second die result is " + num2 + ".");
		System.out.println("The sum of the two dice are " + (num1 + num2));
	}}