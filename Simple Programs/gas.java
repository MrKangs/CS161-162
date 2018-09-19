public class gas{
	public static void main (String args[]){
		//$2.39 per gallon, 234 miles to Seattle 45 mile per gallon
		System.out.println((234/45)+ " gallon is used to go Seattle from Corvallis");
		final double gas = 2.39;
		System.out.println("$" + (gas * (234/45)) + " needs to go Seattle from Corvallis");
	}
}
