import java.util.*;
public class sample2{
	public static void main(String [] args){
		int i = 0;
		boolean done= false;
		do{
			try{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter an integer: ");
				i = sc.nextInt();
				done = true;
			}catch(InputMismatchException e){
				System.out.println("You need to enter an integer");
				}
			}while(!done);
			System.out.printf("You entered %d\n", i);
	}
}