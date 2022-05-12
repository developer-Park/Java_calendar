package honux.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("Which number do you want add?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] splitedValue = input.split(" ");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);

		System.out.println("Two number's sum result  =" + (first + second));

	}

}
