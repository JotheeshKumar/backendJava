package fullstackdev.development;

public class WordLength {

	static int wordlen(String input[], String selt) {
		int ret = 0;
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		int length = input.length;
		for (int i = 0; i <= length - 1; i++) {
			int length2 = input[i].toCharArray().length;
			if (length2 == 1) {
				input1++;
			}
			if (length2 == 2) {
				input2++;
			}
			if (length2 == 3) {
				input3++;
			}
		}

		switch (selt) {
		case "input1":
			ret = input1;
			break;
		case "input2":
			ret = input2;
			break;
		case "input3":
			ret = input3;
			break;
		default:
			System.out.println("please enter the digits equl r within 3");
			break;
		}

		return ret;

	}

	public static void main(String[] args) {
		String input[] = { "aa", "a", "ab", "acd" };
		String findLenCount = "input3";
		WordLength sc = new WordLength();
		int wordlen = sc.wordlen(input, findLenCount);
		System.out.println("word count of " + findLenCount + " is: " + wordlen);

	}

}
