package fullstackdev.development;

public class ConcateString {
	String complete = "";

	void concatString(String input1[], int n) {
		// String input1[]={"abc","da","ram"};
		int t = n - 1;
		for (int i = 0; i <= input1.length - 1; i++) {
			char[] charArray = input1[i].toCharArray();
			if ((t) <= charArray.length - 1) {
				for (int j = 0; j <= charArray.length - 1; j++) {
					{
						if (t == j) {
							complete = complete + charArray[j];

						}

					}
				}
			} else {
				if (t >= charArray.length - 1) {
					complete = complete + "$";
				}
			}

		}
	}

	void disp() {
		System.out.println("formatted string : " + complete);
	}

	public static void main(String[] args) {
		String input1[] = { "abc", "da", "ram" };
		int n = 3;
		ConcateString sc = new ConcateString();
		sc.concatString(input1, n);
		sc.disp();

	}

}
