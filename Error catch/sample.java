import java.util.Scanner;

public class sample{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x =1;
		do{


			try{
				System.out.println("Enter the first integer: ");
				int n1 = sc.nextInt();
				System.out.println("Enter the second integer: ");
				int n2 = sc.nextInt();
				System.out.println(n1/n2);
				x = 2;
			}catch(Exception e){
			System.out.println("You can't enter a zero");
	}
	}while(x==1);
}
}