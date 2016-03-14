//U10416030 陳子勤

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
		MyCalendar myCal = new MyCalendar();
		myCal.getCalendar(year, month);

	}

	public static void printMonthTitle(int year, int month) {	//印出標題
		System.out.println("	" + getMonthName(month) + 
				" " + year);
		System.out.println("---------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static String getMonthName(int month) {	//印出使用者輸入的是哪個月份
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
}

class MyCalendar {
	
	MyCalendar() {
	}
	
	public void getCalendar(int year, int month) {
		Calendar g = new GregorianCalendar(year, month-1, 1);	//新增GregorianCalendar的類別
		int day = g.getActualMaximum(Calendar.DATE);	//取得月份的總天數
		int dayOfWeek = g.get(Calendar.DAY_OF_WEEK);	//取得目前是一個禮拜中的第幾天
		int dayOfMonth = g.get(Calendar.DAY_OF_MONTH);	//取得月份的第一天
		
		for(int k = 1 ; k < dayOfWeek ; k++) {	//將月份第一天前的目份保留為空白
			System.out.print("    ");
		}
		
		for(dayOfMonth = 1 ; dayOfMonth <= day ; dayOfMonth++) {	//從第一天往後算，並連續印出月曆
			if(dayOfMonth < 10) {
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
