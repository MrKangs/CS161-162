import java.util.*;
public class Assignment7_9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
		double [] Num = new double [10];
		for(int i = 0; i < 10; i++){
			Num[i] = sc.nextDouble();
		}
		double min = Num[0];

		for (int i = 0; i < 10; i++){
			if (Num[i] <= min){
				min = Num[i];
			}
		}
		System.out.println("The minimum number of this list is " + min);
	}
}