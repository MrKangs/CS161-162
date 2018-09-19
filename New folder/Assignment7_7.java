import java.util.*;
public class Assignment7_7{
	public static void main(String [] args){
		Random rd = new Random();
		int [] Num = new int [100];
		int counter = 0;

		for(int i = 0; i <Num.length; i++){
			Num[i] = rd.nextInt(10);
		}


		for(int i = 0; i < 10; i++){
			for(int j = 0; j < Num.length; j++){
				if (Num[j] == i){
					counter++;
				}
			}


			System.out.println("There are " + counter + "  " + i + "'s in this list");
			counter = 0;
		}
	}
}
