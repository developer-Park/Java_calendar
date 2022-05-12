package honux.calendar;

import java.util.Scanner;



public class for_loop_calendar {


private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

public int getMaxDaysOfMonth(int month) {
 return MAX_DAYS[month - 1];	
}

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		for_loop_calendar cal = new for_loop_calendar();
		
		System.out.println("Enter the number of repetitions.");
		int input = scanner.nextInt();
		
		for(int i=0; i<=input -1; i++) {
			System.out.println("Enter the month you want to search.");
			int month = scanner.nextInt();
			
			System.out.println(month + "'s  end date is" + cal.getMaxDaysOfMonth(month));
			
		}
		System.out.println("Bye :)");
	}
}
