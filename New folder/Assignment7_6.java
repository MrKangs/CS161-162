public class Assignment7_6{
	public static void main(String [] args){
		int PrimeNumberCounter = 10000;
		int counter = 0;
		int number = 2; //Let start at 2 and everyone knows that 1 is also a prime number
		double checker1;
		int checker;
		int i =0;
		int [] PrimeNumber = new int [PrimeNumberCounter];
		System.out.println("The " + PrimeNumberCounter + " will be the following list:");
		while(counter < PrimeNumberCounter){
			checker1 = Math.sqrt(number);
			//checker1 = (number/2);
			checker = (int) checker1;
			while(0 != checker){
				if ((number % checker) == 0 && number !=2 && number != 3){
					number++;
					checker =0;
				}else{
					if(checker == 2 || checker == 1){
						counter++;
						PrimeNumber[i] = number;
						number++;
						System.out.print(PrimeNumber[i]+"  ");
						i++;
						checker =0;
					}else{
						checker--;
					}
				}
			}
		}
	}
}