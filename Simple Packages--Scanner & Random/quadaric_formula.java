import java.util.*;
public class quadaric_formula {
	public static void main(String args[]) {
		Scanner Sc = new Scanner (System.in);
		System.out.println("ax^2+bx+c=0");
		System.out.print("What is your a valve?: ");
		double a = Sc.nextDouble();
		System.out.print("What is your b vavle?: ");
		double b = Sc.nextDouble();
		System.out.print("What is your c valve?: ");
		double c = Sc.nextDouble();
		double discriminat = Math.pow(b,2)-4*a*c;
		double dom = 2*a;
		double num1 = (((-b+Math.sqrt(discriminat))/dom));
		double num2 = (((-b-Math.sqrt(discriminat))/dom));
		System.out.println("X= " + num1 +", "+ num2);
		System.out.println("If you get NaN , NaN, then there are no real solutions");
	}
}