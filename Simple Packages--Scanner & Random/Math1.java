import java.lang.*;
import java.util.*;
public class Math1{
	public static void main(String args[]){
		Random RD = new Random();
		int int1 = RD.nextInt(2000);
		int int2 = RD.nextInt(2000);
		double num1 = Math.random()+1000 -int1;
		double num2 = Math.random()+1000 -int2;
		Random rd = new Random();
		int num3 = rd.nextInt(1000)- int1;
		System.out.println(num1 + ", " +  num2 + ", " + num3);
		double num4 = Math.abs(num1);
		double num5 = Math.abs(num2);
		int num6 = Math.abs(num3);
		System.out.println(num4 + ", " + num5 + ", " + num6);
		double SINE1 = Math.sin(num4);
		double COSINE1 = Math.cos(num5);
		double TAGENT1 = Math.tan(num6);
		double SINE2 = Math.sin(num1);
		double COSINE2 = Math.cos(num2);
		double TAGENT2 = Math.tan(num3);
		System.out.println(SINE1+ ", " + COSINE1 + ", " + TAGENT1 + ", " + SINE2 + ", " + COSINE2 + ", " + TAGENT2);
}}