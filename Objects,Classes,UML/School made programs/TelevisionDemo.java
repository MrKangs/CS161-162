import java.util.Scanner;  // Needed for the Scanner class
public class TelevisionDemo
{
   public static void main(String[] args)
   {
	Scanner keyboard = new Scanner (System.in);// Create a Scanner object to read from the keyboard

	// Declare variables
	int station; // The user's channel choice
	Television bigScreen = new Television(55, "Toshiba");// Declare and instantiate a television object
	bigScreen.powerOn();// Turn the power on

	System.out.println("A " + bigScreen.getSize() + " inch " + bigScreen.getManufacturer() + " has been turned on.");// Display the state of the television
	System.out.print("What channel do you want? ");// Prompt the user for input and store into station
	station = keyboard.nextInt();

	bigScreen.setChannel(station);// Change the channel on the television
	bigScreen.increaseVolume();// Increase the volume of the television

	System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());// Display the the current channel and volume of the television
	System.out.println("Too loud! Lowering the volume.");

	// Decrease the volume of the television
	//reference decrease volume
	bigScreen.decreaseVolume();
	bigScreen.decreaseVolume();
	bigScreen.decreaseVolume();
	bigScreen.decreaseVolume();
	bigScreen.decreaseVolume();
	bigScreen.decreaseVolume();

	// Display the the current channel and
	// volume of the television
	System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
	System.out.println();   // For a blank line

	Television portable = new Television (19, "Sharp");
	portable.powerOn();// Turn the power on
	System.out.println("A " + portable.getSize() + " inch " + portable.getManufacturer() + " has been turned on.");// Display the state of the television
	System.out.print("What channel do you want? ");// Prompt the user for input and store into station
	station = keyboard.nextInt();

	portable.setChannel(station);// Change the channel on the television
	portable.decreaseVolume();// Increase the volume of the television
	portable.decreaseVolume();

	System.out.println("Channel: " + portable.getChannel() + " Volume: " + portable.getVolume());
	System.out.println();   // For a blank line

   }

}

