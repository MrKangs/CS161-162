public class time{
	public long hour, minute, second;

	//Create a time object for the current time
	time(){
		this(0);
	}
	 //Jan, 1, 1970 to present

	 time(long pastedtime){
		 settime(pastedtime);
	 }

	 //Time object with certain contitions
	 time(long Hour, long Minute, long Second){
		 this.hour = Hour;
		 this.minute = Minute;
		 this.second = Second;
	 }

	 //tell what time in hour

	 public long getHour(){
		 return hour;
	 }

	 //tell what time in minute
	 public long getMinute(){
		 return minute;
	 }

	 //tell what time in second
	 public long getSecond(){
		 return second;
	 }

	 //set a new time for the object using the elasped time
	 public void settime(long pastedtime){
		 long totalMilliseconds = System.currentTimeMillis();
		 long totalSeconds = totalMilliseconds/1000;
		 second = totalSeconds % 60;
		 long totalMinutes = totalSeconds / 60;
		 minute = totalMinutes % 60;
		 long totalHours = totalMinutes / 60;
		 hour = totalHours % 24;

		 if(pastedtime > 0){
			totalSeconds = pastedtime / 1000;
			second += totalSeconds % 60;
			totalMinutes = totalSeconds / 60;
			minute += totalMinutes % 60;
			totalHours = totalMinutes / 60;
			hour += totalHours % 24;
		}
	}
}