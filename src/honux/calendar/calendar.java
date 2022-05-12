package honux.calendar;

import java.util.Scanner;
import java.util.*;

public class calendar {

	public static void main(String[] args) {
		String[][] weekdays = { { "Sun", " Mon", " Tue", "Wed", " Thur", " Fri", "Sat" }, { "---------------------------" }, };

		for (int i = 0; i < weekdays.length; i++) {
			for (int j = 0; j < weekdays[i].length; j++) {
				System.out.printf("%3s", "  " + weekdays[i][j]);

			}
			System.out.println();
		}

		int[][] data = new int[4][7];
		int num = 1;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				data[i][j] = num;
				System.out.printf("%4d", data[i][j]);
				num++;
			}
			System.out.println();
		}

	}

}
