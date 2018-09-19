import java.util.*;
public class Random2{
	public static void main(String args[]){
	int max = 999999*2;
	int min = -999999;

	Random Rd = new Random();
	int showMe = min + Rd.nextInt(max);
	System.out.println(showMe);

	Random rd = new Random();
	int num = rd.nextInt(100);
	System.out.println(num);

	Random RD = new Random();
	System.out.println("Next Int value: " + RD.nextInt(1001));

	Random rD = new Random();
	int num1 = rD.nextInt(1000);
	int num2 = rD.nextInt(1000);
	System.out.println("Random Integers: " + num1  + ", " + num2);
	double num3, num4;
	num3 = rD.nextDouble();
	num4 = rD.nextDouble();
	System.out.println("Random Numbers: " + (num3 + num1)  + ", " + (num2 + num4));
}}
