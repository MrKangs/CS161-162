import java.util.*;
public class chapter8quiz{
	public static void main(String args[]){
		Random rd = new Random();
		int [][] sales = new int [10][52];
		for(int i = 0; i < 10; i ++){
			for(int j = 0; j < 52; j ++){
				sales [i][j] = rd.nextInt(100);
			}
		}

		int max = 0;
		int min = 100;
		int range = 0;
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 52; j++){
				if (sales[i][j] > max){
					 max = sales [i][j];
				 }
				 if (sales[i][j] < min){
					 min = sales[i][j];
				 }
			 }
			 range = max - min;
			 System.out.println("The number " + (i+ 1) + " employee sales range is " + range + ". ");
			 max = 0;
			 min = 100;
			 range = 0;
		 }
		 /*range = max - min;
		 System.out.println(max + " " + min);*/
	 }
 }
