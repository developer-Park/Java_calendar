package honux.calendar;


import java.util.*;

public class Prompt {
/**
 * 
 * @param week
 * @return 0 ~ ( 0 = Sunday, 6 = Saturday)
 */
	public int parseDay(String week) {
		if(week.equals("su")) return 0;
	    else if(week.equals("mo")) return 1;
	    else if(week.equals("tu")) return 2;
	    else if(week.equals("we")) return 3;
	    else if(week.equals("th")) return 4;
	    else if(week.equals("fr")) return 5;
	    else if(week.equals("sa")) return 6;
	    else	return 0;
	}
	
	

	public void runPrompt() {

		Scanner scanner = new Scanner(System.in);
		calendar1 cal1 = new calendar1();
		
		int month = -1;
		int year = 2017;
	
		while (true) {
			System.out.println("Enter the Year. exit : -1");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if(year == -1)
				break;

			System.out.println("Enter the Month.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			
			
			
			
			
			
			
			if (month > 12 || month < 1) {
				System.out.println("Error");
				continue;
			}
			cal1.printCalendar(year, month);
		}
		System.out.println("Bye~");
		scanner.close();

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}