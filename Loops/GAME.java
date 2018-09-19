import java.util.*;
public class GAME{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		boolean okay;
		int x = 1;
		int z = 0;
		int a = 0;
		do {
			System.out.println("Hey Loser, Guess my Number. \nThe Number range is between 1 to 10: ");
			int n = sc.nextInt();
			int y = rand.nextInt(9)+1;
			if (n == y && n <= 10 && n > 0){
				okay = true;
				System.out.println("You beat me Loser.");
			}else if (n != y && n <= 10 && n > 0){
				System.out.println("You lost! Loser");
				okay = false;
				if (n > y){
					System.out.println("Your Number is too High Loser");
					x++;
					a++;
				}else if (n < y){
					System.out.println("Your Number is too Low Loser");
					x++;
					z++;
				}else {
					System.out.println("I don't know Loser!");
					x++;
				}
			}else if(n >= 11 || n <= 0){
				System.out.println("Can't you Read Numbers?! The NUMBER RANGE IS BETWEEN 1 TO 10 LOSER");
				okay = false;
			}else {
				System.out.println("Hum.. I think the Game is Broken");
				okay = false;
			}
		}while(!okay);
		System.out.println("Game Over! You WIN!");
		System.out.println("You tried " + x + " times to win the Game");
		System.out.println("You had " + a + " amount of numbers of High Number");
		System.out.println("You had " + z + " amount of numbers of Low Number");
}}
