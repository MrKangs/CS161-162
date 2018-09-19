/**9.4 (Use the Random class) Write a program that creates
a Random object with seed 1000 and displays the first 50 random
integers between 0 and 100 using the nextInt(100) method.*/
import java.util.*;
public class Assignment9_4{
	 public static void main(String[] args) {
		 Random random = new Random(1000);
	     for (int i = 0; i < 50; i++) {
			 System.out.println(random.nextInt(101)); // displays 1-99
		 }
	 }
 }