package fullstackdev.development;

public class CharRemove {
	int sum = 0;

	void charRemove(String[] chart) {
		// = { "2AA", "12", "ABC", "c1a" };
		for (int i = 0; i <= chart.length - 1; i++) {
			char[] charArray = chart[i].replaceAll("[a-zA-Z]", "").toCharArray();

			for (int j = 0; j <= charArray.length - 1; j++) {
				sum += Character.getNumericValue(charArray[j]);
			}

		}

	}

	void disp() {
		System.out.println("sum of all values is : " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] chart = { "2AA", "12", "ABC", "c1a" };
		CharRemove sc = new CharRemove();
		sc.charRemove(chart);
		sc.disp();

	}

}
