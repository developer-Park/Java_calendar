package honux.calendar;

import java.util.Scanner;

public class while_loop {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while_loop cal = new while_loop();
		String PROMPT = "cal> ";
		
		int month = 1;

		while (month >= 1 && month <= 12) {

			
			System.out.println("Enter the Month.");
			System.out.print(PROMPT);
			System.out.println(month + "'s end date is " + cal.getMaxDaysOfMonth(month));
			month = scanner.nextInt();
			if (month == -1) {
				System.out.print(PROMPT);
				System.out.println("Good bye");
				break;
			}

		}
	}
}
