public class BirthdayBody{
	public static void main(String [] args){
		Birthday birthObject = new Birthday(2000,7,9);
		Students nameObject = new Students("Kenneth", birthObject);
		System.out.println(nameObject);
	}
}
