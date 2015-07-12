/**
 * Exercise: The MyTime Class
 * A class called MyTime, which models a time instance, is designed as shown in the class diagram.
 * It contains the following private instance variables:
 * 
 * hour: between 0 to 23.
 * minute: between 0 to 59.
 * Second: between 0 to 59.
 * 
 * The constructor shall invoke the setTime() method (to be described later) 
 * to set the instance variable.
 * 
 * It contains the following public methods:
 * 
 *  - setTime(int hour, int minute, int second): It shall check if the given hour, 
 * 		minute and second are valid before setting the instance variables.
 * 		(Advanced: Otherwise, it shall throw an IllegalArgumentException with the message 
 * 		"Invalid hour, minute, or second!".)
 *
 *  - Setters setHour(int hour), setMinute(int minute), setSecond(int second): 
 *  	It shall check if the parameters are valid, similar to the above.
 * 
 *  - Getters getHour(), getMinute(), getSecond().
 *  
 *  - toString(): returns "HH:MM:SS".
 *  
 *  - nextSecond(): Update this instance to the next second and return this instance. 
 *  	Take note that the nextSecond() of 23:59:59 is 00:00:00.
 * 
 *  - nextMinute(), nextHour(), previousSecond(), previousMinute(), previousHour(): similar to the above.
 *  
 *  Write the code for the MyTime class. Also write a test program (called TestMyTime) to 
 *  test all the methods defined in the MyTime class.
 *  
 *  
 * 
 */
package oop.excercises.themytimeclass;

public class MyTime {

	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	/**
	 * The constructor invokes the setTime() method to set the instance
	 * variable.
	 * 
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public MyTime(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	/**
	 * Method setTime(int hour, int minute, int second): It checks if the given
	 * hour, minute and second are valid before setting the instance variables.
	 * (Advanced: Otherwise, it shall throw an IllegalArgumentException with the
	 * message "Invalid hour, minute, or second!".)
	 * 
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public void setTime(int hour, int minute, int second) {
		try {
			setHour(hour);
			setMinute(minute);
			setSecond(second);
		} catch (IllegalArgumentException iae) {
			System.out.println("Invalid hour, minute, or second!");
		}

	}

	/**
	 * Method setHour(int hour): It checks if the parameter (int hour) is valid.
	 * 
	 * @param hour
	 */
	public void setHour(int hour) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		} else {
			throw new IllegalArgumentException();
		}

	}

	/**
	 * Method setMinute(int minute): It checks if the parameter (int minute) is
	 * valid.
	 * 
	 * @param minute
	 */
	public void setMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Method setSecond(int second): It checks if the parameter (int second) is
	 * valid.
	 * 
	 * @param second
	 */
	public void setSecond(int second) {
		if (second >= 0 && second < 60) {
			this.second = second;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/*
	 * Getters getHour(), getMinute(), getSecond().
	 */

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	/**
	 * Method nextSecond(): Update this instance to the next second and return
	 * this instance. Take note that the nextSecond() of 23:59:59 is 00:00:00.
	 * 
	 * @return this instance with increased second
	 */
	public MyTime nextSecond() {
		++second;
		if (second == 60) {
			second = 0;
			minute++;
		}
		if (minute == 60) {
			minute = 0;
			hour++;
		}
		if (hour == 24) {
			hour = 0;
		}
		return this;
	}

	/**
	 * Method nextMinute(): Update this instance to the next minute and return
	 * this instance.
	 * 
	 * @return this instance with increased minute
	 */
	public MyTime nextMinute() {
		++minute;
		if (minute == 60) {
			minute = 0;
			hour++;
		}
		if (hour == 24) {
			hour = 0;
		}
		return this;
	}

	/**
	 * Method nextHour(): Update this instance to the next hour and return this
	 * instance.
	 * 
	 * @return this instance with increased hour
	 */
	public MyTime nextHour() {
		hour++;
		if (hour == 24) {
			hour = 0;
		}
		return this;
	}

	/**
	 * Method previousSecond(): Update this instance to the previous second and
	 * return this instance. Take note that the previousSecond() of 00:00:00 is
	 * 23:59:59.
	 * 
	 * @return this instance with decreased second
	 */
	public MyTime previousSecond() {
		second--;
		if (second == -1) {
			second = 59;
			minute--;
		}
		if (minute == -1) {
			minute = 59;
			hour--;
		}
		if (hour == -1) {
			hour = 23;
		}
		return this;
	}

	/**
	 * Method previousMinute(): Update this instance to the previous minute and
	 * return this instance.
	 * 
	 * @return this instance with decreased minute
	 */
	public MyTime previousMinute() {
		minute--;
		if (minute == -1) {
			minute = 59;
			hour--;
		}
		if (hour == -1) {
			hour = 23;
		}
		return this;
	}

	/**
	 * Method previousHour(): Update this instance to the previous hour and
	 * return this instance.
	 * 
	 * @return this instance with decreased hour
	 */
	public MyTime previousHour() {
		hour--;
		if (hour == -1) {
			hour = 23;
		}
		return this;
	}

}
