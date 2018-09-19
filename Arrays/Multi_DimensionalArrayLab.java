import java.util.*;
public class Multi_DimensionalArrayLab{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many columes does this matrix have?: ");
		int c = sc.nextInt();
		System.out.print("How many rows does this matrix have?: ");
		int r = sc.nextInt();
		double [][] num = new double[c][r];
		System.out.print("Enter the numbers for this matrix: ");
		for(int i = 0; i < c;i++){
			for(int j = 0; j < r; j++){
				num[i][j] = sc.nextDouble();
			}
		}

		System.out.println("The total sum of this matrix is " + sumMajorDiagonal(num));
	}
	public static double sumMajorDiagonal(double[][] values){
		double total = 0;
		for(int i = 0; i < values.length; i++){
			for(int j = 0; j<values.length;j++){
				total += values[i][j];
			}
		}
		return total;
	}
}
