package fullstackdev.development;

import java.util.Scanner;

public class InputValueCompare {
	String st;

	String compVal(int x, int y) {

		int temp;
		if (x > y) {
			st = y + " is less than " + x;
		} else if (y > x) {
			st = x + " is less than " + y;
		} else {
			st = x + " is equal to " + y;
		}

		return st;

	}

	public static void main(String[] args) {

		InputValueCompare sc = new InputValueCompare();
		int x;
		int y;
		Scanner scin = new Scanner(System.in);
		System.out.println(" Enter the first number : ");
		x = scin.nextInt();
		System.out.println(" Enter the second number : ");
		y = scin.nextInt();
		String compVal = sc.compVal(x, y);
		System.out.println(compVal);

	}

}
