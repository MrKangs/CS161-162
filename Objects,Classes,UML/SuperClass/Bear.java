public class Bear extends Animal{
	private String name;
	public Bear(String name){
		this.name = name;
	}
	public String play(){
		return name + " is playing with the ball";
	}
}