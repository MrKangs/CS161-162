import java.util.Scanner;
public class pay{
	public static void main(String[] args){
		Scanner money = new Scanner(System.in);
		System.out.println("What is your last name? ");
		String name = money.next();
		System.out.println("How much money you get paid per week?");
		Double weekmoney = money.nextDouble();
		System.out.println("How much hours you work per week?");
		int weekhour = money.nextInt();
		System.out.println("You get $" + (weekmoney/weekhour) + " per hour in a week");
	}
}