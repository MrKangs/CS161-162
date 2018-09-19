import java.util.*;
public class Assignment7_3{

		public static void main(String[] args) {
			int[] counter = new int[100];
			System.out.print("Enter the integers between 1 and 100: ");

			Scanner input = new Scanner(System.in);
			int display;
			do {
				display = input.nextInt();
				if (display >= 1 && display <= 100){
					counter[display - 1]++;
				}
			} while (display != 0);


			for (int i = 0; i < counter.length; i++) {
				if (counter[i] > 0)
					System.out.println((i + 1) + " occurs " + counter[i] + " time");
			}
		}
}
