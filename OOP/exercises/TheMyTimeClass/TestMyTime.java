package oop.excercises.themytimeclass;

public class TestMyTime {

	public static void main(String[] args) {
		MyTime time = new MyTime(12, 59, 2);
		System.out.println(time);
		System.out.printf("Hour: %02d, Minute: %02d, Second: %02d\n",
				time.getHour(), time.getMinute(), time.getSecond());
		// time.setTime(24, 0, 0); // Error: Invalid hour, minute, or second!
		// time.setTime(0, 65, 0); // Error: Invalid hour, minute, or second!
		// time.setTime(0, 0, 60); // Error: Invalid hour, minute, or second!
		time.setTime(8, 15, 31);
		System.out.println("New time is: " + time);
		time.setHour(23);
		time.setMinute(59);
		time.setSecond(59);
		System.out.println("New time is: " + time);
		System.out.println("+ 1 second: " + time.nextSecond());
		System.out.println("- 1 second: " + time.previousSecond());
		System.out.println("+ 1 minute: " + time.nextMinute());
		System.out.println("- 1 minute: " + time.previousMinute());
		System.out.println("+ 1 hour: " + time.nextHour());
		System.out.println("- 1 hour: " + time.previousHour());
	}
}
