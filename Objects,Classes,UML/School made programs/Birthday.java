public class Birthday{
	public int day,month,year;

	public Birthday(int Year, int Month, int Day){
		year = Year;
		month = Month;
		day = Day;
	}

	public String toString(){
		return String.format ("%d/%d/%d", month, day, year);
	}
}

