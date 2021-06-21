package fullstackdev.development;

import java.util.Arrays;

public class StringModify {

	public String modify(String str1, String str2) {

		String st = "";

		StringBuilder strOne = new StringBuilder(str1.toLowerCase());
		char genArray[] = newGenArray(str2);
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.toLowerCase().charAt(i);
			int index = strOne.toString().indexOf(ch);
			if (genArray[ch] == ch) {
				st = str1.replace(ch, ch);
			} else {
				st = str1.replace(ch, '+');
			}
		}
		return (st);

	}

	static char[] newGenArray(String mask) {
		char[] array = new char[256];
		for (int i = 0; i < mask.length(); i++) {
			array[mask.charAt(i)] = mask.charAt(i);
		}
		return array;
	}

	public static void main(String[] args) {
		StringModify sc = new StringModify();
		String input1 = "New York";
		String input2 = "N";
		String modify = sc.modify(input1, input2);

		System.out.println("modified string :" + modify);

	}

}
