package honux.calendar;

import java.util.Scanner;
import java.util.*;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {

		Scanner scanner = new Scanner(System.in);
		
		calendar1 cal1 = new calendar1();
		int month = 1;

		while (true) {
			System.out.println("Enter the Month.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month >= 12) {
				continue;
			}
			cal1.printCalendar(2022, month);
		}
		System.out.println("Bye~");
		scanner.close();

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}