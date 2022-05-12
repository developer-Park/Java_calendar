package honux.calendar;

import java.util.Scanner;

public class Searching_calendar {
	public static void main(String[] args) {
		System.out.println("Which month do you want search?");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int excep = 28;
		if(input == 1 || input == 3|| input == 5|| input == 7|| input == 8 || input == 10 || input == 12 ) {
			System.out.printf("%d month's end date is %d",input, 31);
		}else if (input == 4|| input == 6|| input == 9|| input == 11) {
			System.out.printf("%d month's end date is %d",input, 30);
		}else {
			System.out.printf("%d month's end date is %d",input, 28);
		}
			
	}
}