public class countUp{
	public static void main(String [] args){
		countup(5);
		newline();
		countdown(5);
	}
	public static void countup(int n) {
		if (n == 0) {
			System.out.println("Blastoff!");
		} else {
			countup(n - 1);
			System.out.println(n);
	}
}
	public static void newline(){
		System.out.println();
	}
	public static void countdown(int n){
		if (n == 0) {
			System.out.println("Blastoff!");
		}else {
			System.out.println(n);
			countdown(n-1);
		}}}