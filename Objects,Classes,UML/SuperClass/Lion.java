public class Lion extends Animal{
	private String name;
	public Lion(String name){
		this.name = name;
	}
	public String makesound(){
		return name + " says ROAR!";
	}
}
