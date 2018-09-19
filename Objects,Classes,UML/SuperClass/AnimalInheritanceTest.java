public class AnimalInheritanceTest{
	public static void main(String [] args){
		Bear bear = new Bear("Ken");
		Lion lion = new Lion("Seika");

		System.out.println("Bear play: " + bear.play());
		System.out.println("Bear make Sound: " + bear.makesound());
		System.out.println();
		System.out.println("Lion play: " + lion.play());
		System.out.println("Lion make Sound: " + lion.makesound());
	}
}