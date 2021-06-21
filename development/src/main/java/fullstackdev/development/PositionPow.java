package fullstackdev.development;

public class PositionPow {
	static double pow;

	Double findPow(int[] input) {
		// int[] input = {3,6,2,1};

		for (int i = 0; i <= input.length - 1; i++) {
			pow += Math.pow( input[i],i);
		}
		return pow;
	}

	public static void main(String[] args) {
		PositionPow sc = new PositionPow();
		int[] input = { 3, 6, 2, 1 };
		Double value = sc.findPow(input);
		System.out.println("final value : " + (int)pow);
	}

}
