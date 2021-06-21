package fullstackdev.development;

import java.util.Scanner;

public class WeekdayFinder {

	void set() {
		String weekArray1[] = new String[6];
		weekArray1[0]="Sunday";
		weekArray1[1]="Monday";
		weekArray1[2]="Tuesday";
		weekArray1[3]="Wednesday";
		weekArray1[4]="thursday";
		weekArray1[5]="Friday";
		weekArray1[6]="Saturday";
	}
	
	
	
	
	final String weekArray[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Saturday" };
	private String StdFnd;

	String findDay(int std) {
		for (int i = 0; i <= weekArray.length - 1; i++) {
			if (std == i) {
				StdFnd = weekArray[i];
			}
		}
		return StdFnd;

	}

	public static void main(String[] args) {
		WeekdayFinder sc = new WeekdayFinder();
		Scanner scin = new Scanner(System.in);
		int input;
		System.out.println("Enter the day number : ");
		input = scin.nextInt();
		String findDay = sc.findDay(input);

		System.out.println("Enter the day number :" + input + " Day of the week is " + findDay);

	}

}
