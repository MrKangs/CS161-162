public class Apple{
	public static void main(String [] args){
		food f[] = new food[2];
		f[0] = new chocolate();
		f[1] = new beef();

		for(int i = 0; i < 2; ++i){
			f[i].eat();
		}
	}
}