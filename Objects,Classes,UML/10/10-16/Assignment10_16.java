/*(Divisible by 2 or 3) Find the first ten numbers with
50 decimal digits that are divisible by 2 or 3.*/
import java.math.*;

public class Assignment10_16{
	public static void main(String args[]){
	BigInteger a = new BigInteger(
		"10000000000000000000000000000000000000000000000000");

	a.add(BigInteger.ONE);

	int c = 1;

	while (c <= 10){
		if(a.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
		a.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
			System.out.println(a);
			System.out.println();
			c++;
		}

		a = a.add(BigInteger.ONE);
	}
}
}
