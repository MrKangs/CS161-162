import java.util.*;
public class Chapter7Assignment2{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.print("What is your number(Must be an Integer)?: ");
	int x = sc.nextInt();
	if (x > 0){
		while (x >0){
				System.out.println(x);
				x = x -1;
			}
		} else if(x < 0){
			System.out.println("Your number is a negative integer");
		}else {
			System.out.println("Your number is equal to 0");
		}System.out.println("You are done");
	}}


