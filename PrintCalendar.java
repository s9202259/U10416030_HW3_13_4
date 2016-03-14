

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
	}
}
