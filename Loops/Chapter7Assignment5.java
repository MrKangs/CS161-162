public class Chapter7Assignment5{
	public static void main(String args[]){
		int num = 1;
		while(num<20){
			num++;
			System.out.println(num);
		}
		System.out.println();

		int x = 1;
		boolean okay;
		do {
		if (x < 20) {
		okay = true;
		x= x + 1;
		System.out.println(x);
		} else {
		okay = false;
		}
		} while (okay);
	}}