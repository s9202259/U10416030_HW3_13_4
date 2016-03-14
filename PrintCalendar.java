
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PrintCalendar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter full year: ");
		int year = input.nextInt();
		while(year < 0) {
			System.out.println("Please enter again.");
			year = input.nextInt();
		}
		
		System.out.println("Enter month as a number between 1 and 12: ");
		int month = input.nextInt();
		while(month < 0 || month > 12) {
			System.out.println("Please enter again.");
			month = input.nextInt();
		}
		printMonthTitle(year,month);
		getCalendar(year, month);

	}
	
	public static void printMonthTitle(int year, int month) {
		System.out.println("	" + getMonthName(month) + 
				" " + year);
		System.out.println("---------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static String getMonthName(int month) {
		String monthName = "";
		switch(month) {
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December"; break;
		}
		return monthName;
	}
	
	public static void getCalendar(int year, int month) {
		Calendar g = new GregorianCalendar(year, month-1, 1);
		int day = g.getActualMaximum(Calendar.DATE);
		int dayOfWeek = g.get(Calendar.DAY_OF_WEEK);
		int dayOfMonth = g.get(Calendar.DAY_OF_MONTH);
		
		
		for(int k = 1 ; k < dayOfWeek ; k++) {
			System.out.print("    ");
		}
		
		for(dayOfMonth = 1 ; dayOfMonth <= day ; dayOfMonth++) {
			if(dayOfMonth<10) {
				System.out.print("  " + dayOfMonth + " ");
			}
			else {
				System.out.print(" " + dayOfMonth + " ");
			}           
			if (g.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.println(" ");
			}
			g.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
