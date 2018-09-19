/*(Large prime numbers) Write a program that finds
five prime numbers larger than Long.MAX_VALUE.*/

import java.math.*;

public class Assignment10_18{
	public static void main(String [] args){
		BigInteger prime = new BigInteger(Long.MAX_VALUE+ "");
		final int PrimeNumber = 5;
		int c = 0;

		while (c <= PrimeNumber){
			prime = prime.add(new BigInteger("1"));
			if(isPrime(prime)){
				c++;
				System.out.println(prime);
			}
		}
	}

	public static boolean isPrime(BigInteger p){
		for (BigInteger a = new BigInteger("2"); a.compareTo(p.divide(new BigInteger("2"))) <=0;
		a = a.add(new BigInteger("1"))){
			if(p.remainder(a).compareTo(new BigInteger("0")) == 0){
				return false;
			}
		}
		return true;
	}
}
