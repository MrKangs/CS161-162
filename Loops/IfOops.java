public class IfOops {
   public static int smaller = 0;
   public static int minimum(int a, int b) {  // returns which int is smaller
          if (a < b) {
               smaller = a;
           } else if(a > b) {
               smaller = b;
   		}else {
   		}return smaller;
		}
   public static void main(String[] args) {
        int a = 7;
        int b = 42;
        minimum(a, b);
        if (smaller == a) {
            System.out.println("a is the smallest!");
		}else if (smaller == b){
			System.out.println("b is the smallest!");
		}else {
			System.out.println("a and b are equal!");
		}}}

