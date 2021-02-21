package dailyPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.ZonedDateTime;

public class DailyPractice_02_21_21 {
	
	public static void main(String[] args)
	{
		//getting to know the java.time package
		
		System.out.println("\nThe Local Time is: " + LocalTime.now().toString());
		
		System.out.println("\nThe Local Date and Time is: " + LocalDateTime.now().toString());
		
		System.out.println("\nThe Time Zone Date and Time is: " + ZonedDateTime.now().toString());
		
		System.out.println("\nThe Month and day is: " + MonthDay.now().toString());
		
		System.out.println("\nThe Year and month is: " + YearMonth.now().toString());
		
		LocalDate date = LocalDate.parse("2021-02-21");
		System.out.println(date);
		
		//also use the LocalDate.of to create strings by supplying integers for year, month, day
		LocalDate todaysDate = LocalDate.of(2021, 2, 21);
		System.out.println(todaysDate);
		
		//there is also a month object
		Month theMonth = Month.APRIL;
		System.out.println(theMonth);
		
		//getters for the year, date and month
		LocalDate theDate = LocalDate.now();
		int thisYear = theDate.getYear();
		int thisMonth = theDate.getMonthValue();
		int thisDay = theDate.getDayOfMonth();
		System.out.println("The year is: " + thisYear + "\nThe month is: " + thisMonth + "\nThe day is: " + thisDay);
		
		System.out.println("The day of the week is: " + date.getDayOfWeek());
		
		System.out.println("\nDate Calculations");
		System.out.println("\nTodays date: " + theDate);
		System.out.println("\nTomorrow: " + theDate.plusDays(1));
		System.out.println("\nNext week: " + theDate.plusWeeks(1));
		System.out.println("\nNext month: " + theDate.plusMonths(1));
		System.out.println("\nNext year: " + theDate.plusYears(1));
		
	
		
		
	}

}
