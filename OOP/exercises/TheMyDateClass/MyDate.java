package oop.excercises.themydateclass;

/**
 * A class called MyDate, which models a date instance, is defined as shown in
 * the class diagram. 
 * The MyDate class contains the following private instance variables: 
 * - year (int): Between 1 to 9999. 
 * - month (int): Between 1 (Jan) to 12 (Dec). 
 * - day (int): Between 1 to 28|29|30|31, where the last day depends
 * 		on the month and whether it is a leap year for Feb (28|29).
 * 
 * It also contains the following private static variables (drawn with
 * underlined in the class diagram): 
 * - strMonths (String[]), strDays (String[]), and dayInMonths (int[]): 
 * static variables, initialized as shown, which are used in the methods. 
 * 
 * The MyDate class has the following public static methods
 * (drawn with underlined in the class diagram): 
 * - isLeapYear(int year): returns true if the given year is a leap year. 
 * 		A year is a leap year if it is divisible by 4 but not by 100, or it is 
 * 		divisible by 400. 
 * - isValidDate(int year, int month, int day): returns true if the given year, month, 
 *	 	and day constitute a valid date. Assume that year is between 1 and 9999, month is
 * 		between 1 (Jan) to 12 (Dec) and day shall be between 1 and 28|29|30|31
 * 		depending on the month and whether it is a leap year on Feb. 
 * - getDayOfWeek(int year, int month, int day): returns the day of the week, 
 * where 0 for Sun, 1 for Mon, ..., 6 for Sat, for the given date. Assume that 
 * the date is valid. Read the earlier exercise on how to determine the day of 
 * the week (or Wiki "Determination of the day of the week"). 
 * 
 * The MyDate class has one constructor, which takes 3 parameters: year, month 
 * and day. It shall invoke setDate() method (to be described later) to set the 
 * instance variables. The MyDate class has the following public methods: 
 * - setDate(int year, int month, int day): It shall invoke the static method 
 * 		isValidDate() to verify that the given year, month and day constitute a 
 * 		valid date. (Advanced: Otherwise, it shall throw an IllegalArgumentException 
 * 		with the messag "Invalid year, month, or day!".) 
 * - setYear(int year): It shall verify that the given year is between 1 and 9999. 
 * 		(Advanced: Otherwise, it shall throw an IllegalArgumentException with the 
 * 		message "Invalid year!".) 
 * - setMonth(int month): It shall verify that the given month is between 1 and 12. 
 * 		(Advanced: Otherwise, it shall throw an IllegalArgumentException with the 
 * 		message "Invalid month!".) 
 * - setDay(int day): It shall verify that the given day is between 1 and dayMax, 
 * 		where dayMax depends on the month and whether it is a leap year for Feb. 
 * 		(Advanced: Otherwise, it shall throw an IllegalArgumentException with the 
 * 		message "Invalid month!".) 
 * - getYear(), getMonth(), getDay(): return the value for the year, month and day,
 * 		respectively. 
 * - toString(): returns a date string in the format "xxxday d mmm yyyy", e.g., 
 * 		"Tuesday 14 Feb 2012". 
 * - nextDay(): update this instance to the next day and return this instance. 
 * 		Take note that nextDay() for 31 Dec 2000 shall be 1 Jan 2001. 
 * - nextMonth(): update this instance to the next month and return this instance. 
 * 		Take note that nextMonth() for 31 Oct 2012 shall be 30 Nov 2012. 
 * - nextYear(): update this instance to the next year and return this instance. 
 * 		Take note that nextYear() for 29 Feb 2012 shall be 28 Feb 2013. 
 * 		(Advanced: throw an IllegalStateException with the message "Year out of range!" 
 * 		if year > 9999.) 
 * - previousDay(), previousMonth(), previousYear(): similar to the above. 
 * 
 * Write the code for the MyDate class.
 * Use the following test statements to test the MyDate class:
 * MyDate d1 = new MyDate(2012, 2, 28); 
 * System.out.println(d1); // Tuesday 28 Feb 2012
 * System.out.println(d1.nextDay()); // Wednesday 29 Feb 2012
 * System.out.println(d1.nextDay()); // Thursday 1 Mar 2012
 * System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
 * System.out.println(d1.nextYear()); // Monday 1 Apr 2013
 * 
 * MyDate d2 = new MyDate(2012, 1, 2); 
 * System.out.println(d2); // Monday 2 Jan
 * 2012 System.out.println(d2.previousDay()); // Sunday 1 Jan 2012
 * System.out.println(d2.previousDay()); // Saturday 31 Dec 2011
 * System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
 * System.out.println(d2.previousYear()); // Tuesday 30 Nov 2010
 * 
 * MyDate d3 = new MyDate(2012, 2, 29); 
 * System.out.println(d3.previousYear()); // Monday 28 Feb 2011
 * 
 * // MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day! //
 * MyDate d5 = new MyDate(2011, 2, 29); // Invalid year, month, or day! 
 * 
 * Write a test program that tests the nextDay() in a loop, by printing 
 * the dates from 28 Dec 2011 to 2 Mar 2012.
 *
 */

public class MyDate {

	private final static int MIN_YEAR = 1;
	private final static int MAX_YEAR = 9999;

	private int year;
	private int month;
	private int day;

	private final static String[] strMonths = { "Jan", "Feb", "Mar", "Apr",
			"May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	private final static String[] strDays = { "Sunday", "Monday", "Tuesday",
			"Wednesday", "Thursday", "Friday", "Saturday" };

	private final static int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31,
			30, 31, 30, 31 };

	/**
	 * A year is a leap year if it is divisible by 4 but not by 100, or it is
	 * divisible by 400.
	 * 
	 * @param year
	 * @return true if the given year is a leap year
	 */
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	/**
	 * isValidDate(int year, int month, int day): returns true if the given
	 * year, month, and day constitute a valid date. Assume that year is between
	 * 1 and 9999, month is between 1 (Jan) to 12 (Dec) and day shall be between
	 * 1 and 28|29|30|31 depending on the month and whether it is a leap year on
	 * Feb.
	 * 
	 * @param date
	 * @return true if the given year, month, and day constitute a valid date
	 */
	public static boolean isValidDate(int year, int month, int day) {
		if (year < MIN_YEAR || year > MAX_YEAR)
			return false;
		if (month < 1 || month > 12)
			return false;
		int maxDays = daysInMonths[month - 1]
				+ ((isLeapYear(year) && month == 2) ? 1 : 0);
		return (day >= 1 && day <= maxDays);
	}

	/**
	 * getDayOfWeek(int year, int month, int day): returns the day of the week,
	 * where 0 for Sun, 1 for Mon, ..., 6 for Sat, for the given date. Assume
	 * that the date is valid. Read the earlier exercise
	 * (https://www3.ntu.edu.sg
	 * /home/ehchua/programming/java/J2a_BasicsExercises.html#dateutil) on how
	 * to determine the day of the week (or Wiki
	 * "Determination of the day of the week").
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @return the day of the week, where 0 for Sun, 1 for Mon, ..., 6 for Sat,
	 *         for the given date. If date is not valid, returns -1;
	 */
	public static int getDayOfWeek(int year, int month, int day) {
		if (!isValidDate(year, month, day))
			return -1;

		// 1. Based on the first two digit of the year, get the number from the
		// "century" table.
		int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);

		// 2. Add to the last two digit of the year.
		int lastTwoDigitsOfYear = year % 100;

		// 3. Add to
		// "the last two digit of the year divide by 4, truncate the fractional part".
		int magicYearNumber = lastTwoDigitsOfYear / 4;

		// 4. Add to the number obtained from the month table:
		int[] nonLeapYearMonthNumbers = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		int[] leapYearMonthNumbers = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		int magicMonthNumber = (isLeapYear(year) ? leapYearMonthNumbers[month - 1]
				: nonLeapYearMonthNumbers[month - 1]);

		// 5. Add to the day
		int magicDayNumber = day;

		// 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1
		// for MON, ..., 6 for SAT.
		return (magicCenturyNumber + lastTwoDigitsOfYear + magicYearNumber
				+ magicMonthNumber + magicDayNumber) % 7;
	}

	/**
	 * Constructor, which takes 3 parameters: year, month and day. It shall
	 * invoke setDate() method to set the instance variables.
	 * 
	 * @param year
	 * @param month
	 * @param day
	 */
	public MyDate(int year, int month, int day) {
		try {
			setDate(year, month, day);
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
	}

	/**
	 * setDate(int year, int month, int day): It shall invoke the static method
	 * isValidDate() to verify that the given year, month and day constitute a
	 * valid date. (Advanced: Otherwise, it shall throw an
	 * IllegalArgumentException with the message
	 * "Invalid year, month, or day!".)
	 * 
	 * @param year
	 * @param month
	 * @param day
	 */
	public void setDate(int year, int month, int day)
			throws IllegalArgumentException {
		if (isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		} else {
			throw new IllegalArgumentException("Invalid year[1-9999], month[1-12], or day[1-28|29|30|31]!");
		}
	}

	/**
	 * setYear(int year): It shall verify that the given year is between 1 and
	 * 9999. (Advanced: Otherwise, it shall throw an IllegalArgumentException
	 * with the message "Invalid year!".)
	 * 
	 * @param year
	 */
	public void setYear(int year)  throws IllegalArgumentException {
		if (year >= MIN_YEAR && year <= MAX_YEAR) {
			this.year = year;
		} else {
			throw new IllegalArgumentException("Invalid year![1-9999]");
		}
	}

	/**
	 * setMonth(int month): It shall verify that the given month is between 1
	 * and 12. (Advanced: Otherwise, it shall throw an IllegalArgumentException
	 * with the message "Invalid month!".)
	 * 
	 * @param month
	 */
	public void setMonth(int month) throws IllegalArgumentException {
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			throw new IllegalArgumentException("Invalid month![1-12]");
		}
	}

	/**
	 * setDay(int day): It shall verify that the given day is between 1 and
	 * dayMax, where dayMax depends on the month and whether it is a leap year
	 * for Feb. (Advanced: Otherwise, it shall throw an IllegalArgumentException
	 * with the message "Invalid day!".)
	 * 
	 * @param day
	 */
	public void setDay(int day) throws IllegalArgumentException {
		if ((day >= 1 && day <= daysInMonths[month - 1])
				|| (isLeapYear(year) && month == 2 && day >= 1 && day <= 29)) {
			this.day = day;
		} else {
			throw new IllegalArgumentException("Invalid day![1-28|29|30|31]");
		}
	}

	//
	// getYear(), getMonth(), getDay():
	// return the value for the year, month and day, respectively.
	//
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	// toString():
	// returns a date string in the format "xxxday d mmm yyyy",
	// e.g., "Tuesday 14 Feb 2012".
	@Override
	public String toString() {
		if (!isValidDate(year, month, day)) {
			return "Not a valid date!";
		}
		return strDays[getDayOfWeek(year, month, day)] + " " + day + " "
				+ strMonths[month - 1] + " " + year;
	}

	/**
	 * nextDay(): update this instance to the next day and return this instance.
	 * Take note that nextDay() for 31 Dec 2000 shall be 1 Jan 2001.
	 * 
	 * @return this instance with increased day
	 */
	public MyDate nextDay() throws IllegalArgumentException {
		day++;
		int maxDays = daysInMonths[month - 1]
				+ ((isLeapYear(year) && month == 2) ? 1 : 0);
		if (day > maxDays) {
			day = 1;
			month++;
		}
		if (month > 12) {
			month = 1;
			year++;
		}
		if (year > MAX_YEAR) {
			throw new IllegalArgumentException("Year out of range![1-9999]");
		}
		return this;
	}

	/**
	 * nextMonth(): update this instance to the next month and return this
	 * instance. Take note that nextMonth() for 31 Oct 2012 shall be 30 Nov
	 * 2012.
	 * 
	 * @return this instance with increased month
	 */
	public MyDate nextMonth() throws IllegalArgumentException {
		month++;
		if (month > 12) {
			month = 1;
			year++;
		}
		if (year > MAX_YEAR) {
			throw new IllegalArgumentException("Year out of range![1-9999]");
		}
		int maxDays = daysInMonths[month - 1]
				+ ((isLeapYear(year) && month == 2) ? 1 : 0);
		if (day > maxDays) {
			day = maxDays;
		}
		return this;
	}

	/**
	 * nextYear(): update this instance to the next year and return this
	 * instance. Take note that nextYear() for 29 Feb 2012 shall be 28 Feb 2013.
	 * (Advanced: throw an IllegalStateException with the message
	 * "Year out of range!" if year > 9999.)
	 * 
	 * @return this instance with increased year
	 */
	public MyDate nextYear() throws IllegalArgumentException {
		year++;
		if (year > MAX_YEAR) {
			throw new IllegalArgumentException("Year out of range![1-9999]");
		}
		int maxDays = daysInMonths[month - 1]
				+ ((isLeapYear(year) && month == 2) ? 1 : 0);
		if (day > maxDays) {
			day = maxDays;
		}
		return this;
	}

	/**
	 * previousDay(): update this instance to the previous day and return this
	 * instance.
	 * 
	 * @return this instance with decreased day
	 */
	public MyDate previousDay() throws IllegalArgumentException {
		day--;
		if (day < 1) {
			day = 31;
			month--;
		}
		if (month < 1) {
			month = 12;
			year--;
		}
		if (year < MIN_YEAR) {
			throw new IllegalArgumentException("Year out of range![1-9999]");
		}
		int maxDays = daysInMonths[month - 1]
				+ ((isLeapYear(year) && month == 2) ? 1 : 0);
		if (day > maxDays) {
			day = maxDays;
		}
		return this;
	}

	/**
	 * previousMonth(): update this instance to the previous month and return
	 * this instance.
	 * 
	 * @return this instance with decreased month
	 */
	public MyDate previousMonth() throws IllegalArgumentException {
		month--;
		if (month < 1) {
			month = 12;
			year--;
		}
		if (year < MIN_YEAR) {
			throw new IllegalArgumentException("Year out of range![1-9999]");
		}
		int maxDays = daysInMonths[month - 1]
				+ ((isLeapYear(year) && month == 2) ? 1 : 0);
		if (day > maxDays) {
			day = maxDays;
		}
		return this;
	}

	/**
	 * previousYear(): update this instance to the previous year and return this
	 * instance.
	 * 
	 * @return this instance with decreased year
	 */
	public MyDate previousYear() throws IllegalArgumentException {
		year--;
		if (year < MIN_YEAR) {
			throw new IllegalArgumentException("Year out of range![1-9999]");
		}
		int maxDays = daysInMonths[month - 1]
				+ ((isLeapYear(year) && month == 2) ? 1 : 0);
		if (day > maxDays) {
			day = maxDays;
		}
		return this;
	}
}
