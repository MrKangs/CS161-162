import java.util.*;
public class factorial{
	public static void main(String [] args){

	/*Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int number = sc.nextInt();
	System.out.println(fact(number));*/

	factorial Factorial = new factorial();
	System.out.print(Factorial.getRecursiveFactorial(-6));
	System.out.print(Factorial.getIterativeFactoria(-6));


	}
	/*public static long fact(long n){

	if(n<=1)
		return 1;
	else
		return n * fact(n1-1);
	}*/

	public int getRecursiveFactorial(int n){
		if(n<0) return -1;
		else if (n<2) return 1;
		else return (n * getRecursiveFactorial(n-1));
	}

	public int getIterativeFactoria(int n){
		if(n<0) return -1;
		int fact = 1;
		for(int i = 1; i <= n; i++)
		fact *= i;
		return fact;
	}

	}
