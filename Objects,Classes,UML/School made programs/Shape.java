public abstract class Shape{
	public double calculateVolume(int length, int height){
		return calculateArea(length)*height;
	}
	public abstract double calculateArea(int length);
}

