
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

		GregorianCalendar g = new GregorianCalendar(); 
        g.set(GregorianCalendar.YEAR, year);
        g.set(GregorianCalendar.MONTH, month);

        System.out.println("" + year + "   " + month);
        
        printMonth(year,month);
	}
	public static void printMonth(int year, int month) {
		printMonthTitle(year, month);
	}


	public static void printMonthTitle(int year, int month) {
		System.out.println("	" + getMonthName(month) + 
				"	" + year);
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
			case 12: monthName = "December";
		}
		return monthName;
	}
}
