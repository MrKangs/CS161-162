public class Assignment10_1{
	public static void main(String[] args) {
		// Create two Time objects
		time time1 = new time();
		time time2 = new time(555550000);

		// Display Time objects hour, minute, and
		// second in the format hour:minute:second
		System.out.println(time1.getHour() + ":" + time1.getMinute() +
			":" + time1. getSecond());
		System.out.println(time2.getHour() + ":" + time2.getMinute() +
			":" + time2. getSecond());
	}
}