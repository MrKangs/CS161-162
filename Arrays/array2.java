import java.util.*;
public class array2{
	public static void main(String [] args){
		/*int[][] num = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		System.out.println(sum(num));
			int colTotal = 0;
			for(int i = 0; i < num.length;i++){
				colTotal += num[i][0];
			}
			System.out.println("The total columes sum is "+ colTotal);
			int rowTotal = 0;
			for (int i = 0; i < num.length; i++){
				rowTotal += num[0][i];
			}
			System.out.println("The total row sum is "+ rowTotal);
			int total = 0;
			for(int i = 0; i < num.length; i++){
				for(int j = 0; j < num.length; j++){
					total += num[i][j];
					System.out.println(num[i][j] + "   ");
				}
			}
			System.out.println("The total sum of the list is "+ total);*/
			int ii = 3;
			 int jj = 3;
			int [][] num = new int [ii][jj];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int Num = sc.nextInt();
			for(int i = 0; i < ii; i++){
				for(int j =0; j < jj; j++){
					num[i][j] = sc.nextInt();
				}
			}
			int maxI = 0;
			int maxJ = 0;
			int max = 0;
			for(int i = 0; i < num.length; i++){
				for(int j = 0; j < num.length; j++){
					if(num[i][j] > num[maxI][maxJ]){
						maxI = i;
						maxJ = j;
					}
					if (num[i][j] > max){
						max = num[i][j];
					}
				}
			}
			System.out.println(num[maxI][maxJ]);
			System.out.println(max);
		}

	/*public static int sum(int[][] values){
		int Total = 0;
		for(int i = 0; i < values.length; i++){
			for(int j = 0; j < values.length; j++){
				Total += values[i][j];
			}
		}
		return Total;
	}*/
}
