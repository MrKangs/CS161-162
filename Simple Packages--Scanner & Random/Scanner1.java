import java.util.Scanner;

public class Scanner1{
	public static void main(String [] args){
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your number?" ); //(num = sc.nextInt()));
		num = sc.nextDouble();
		System.out.println("your number is: " + num);
	}
}