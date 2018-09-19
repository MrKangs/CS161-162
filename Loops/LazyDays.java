import java.util.*;
public class LazyDays{
	public static void newLine(){
				System.out.println();
			}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the tempature outside?: ");
		int temp = sc.nextInt();
		int n;
		if ((temp <20) || (temp > 95)){
			 n = 1;
		} else {
			 n = 0;
		}
		switch(n){
			case (1): System.out.println("Visit our shops!");
				break;
			default: System.out.println();
				break;
				}
		newLine();
		if (temp >= 80){
			System.out.println("It is time to swim!");
		}else if ( 60 <= temp){
			System.out.println("It is time to do some tennis!");
		}else if (40 <= temp) {
			System.out.println("It is time to play some golf!");
		}else if (temp < 40){
			System.out.println("It is time for skiing!");
		}}}

