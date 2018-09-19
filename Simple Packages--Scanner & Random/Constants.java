import java.util.Scanner;
public class Constants{
	public static void main(String [] args){
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0/5.0;
		double fahrenheitTemp;
		// value to convert
		System.out.println("What is the Celsius Temperature is ");
		Scanner sc = new Scanner(System.in);
		int cT = sc.nextInt();
		fahrenheitTemp = (cT*CONVERSION_FACTOR) +BASE;
		System.out.println("The celsius temperature: " + cT);
		System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);
	}
}