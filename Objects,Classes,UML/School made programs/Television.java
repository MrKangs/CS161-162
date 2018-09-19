// The purpose of this class is to model a television
// Seika Mahmud, Andrea Leon, Amelia Leon, Kenneth Kang
//3/2/18
public class Television
{
	int channelNumber, volumeLevel;
	boolean powerOn;
	int screenSize;
	String manufacturer;

	public Television(int size, String brand)
	{
		//variables
		this.screenSize = size;
		this.manufacturer = brand;
		this.powerOn = false;
		this.channelNumber = 2;
		this.volumeLevel = 20;
	}

	public int getVolume()
	{
		return volumeLevel;
	}

	public int getChannel()
	{
		return channelNumber;
	}

	public int getSize()
	{
		return screenSize;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public void increaseVolume()
	{
		volumeLevel++;
	}

	public void decreaseVolume()
	{
		volumeLevel--;
	}

	public void setChannel(int channel)
	{
		channelNumber = channel;
	}

	public void powerOn()
	{
		powerOn = !powerOn;
	}
}

