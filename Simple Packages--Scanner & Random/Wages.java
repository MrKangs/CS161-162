import java.text.NumberFormat;
import java.util.Scanner;
public class Wages {
	public static void main (String [] args){
		final double RATE = 8.25;
		final int STANDARD = 40;
		Scanner sc = new Scanner(System.in);
		double pay = 0.0;
		System.out.println("Enter the number of hours worked : ");
		int hours = sc.nextInt();
		System.out.println();
		if (hours > STANDARD){
			pay = STANDARD * RATE + (hours-STANDARD) * (RATE * 1.5);
		}else {
			pay = hours * RATE;
		}NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("Gross earnings: " + fmt.format(pay));
	}}