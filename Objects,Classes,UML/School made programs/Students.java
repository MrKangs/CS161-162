public class Students{
	public String name;
	public Birthday birthdate;

	public Students(String theName, Birthday theDate){
		name = theName;
		birthdate = theDate;
	}

	public String toString(){
		return String.format("My name is " + name + ". My birthday is " +  birthdate);
	}
}