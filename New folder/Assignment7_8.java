import java.util.*;
public class Assignment7_8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double [] Num = new double [10];
		System.out.print("Enter 10 double numbers:");

		for(int i = 0; i < Num.length; i++){
			Num[i] = sc.nextDouble();
		}
		System.out.println("The average of the following numbers is " + average(Num));

	}

	public static int average(int [] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum / array.length;
	}

	public static double average(double [] array){
		double sum= 0;
		for (int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum / array.length;
	}
}