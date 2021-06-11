package fullstackdev.development;

public class BinaryConvert {
	static int[] binaryNum = new int[10];

	static void decToBinary(int n) {

		int i = 0;
		while (n > 0) {
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

	}
	void disp() {
		for(int i=binaryNum.length-1;i>=0;i--)
		System.out.print(binaryNum[i]);
	}

	public static void main(String[] args) {

		BinaryConvert sc = new BinaryConvert();
		sc.decToBinary(52);
		sc.disp();
		
	}

}
