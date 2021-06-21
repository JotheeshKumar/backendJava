package fullstackdev.development;

public class SeatingCapacity {

	int capacity(int x, int y, int z) {

		int temp;
		if (x > y) {
			temp = y;
		} else {
			temp = x;
		}
		if (temp > z) {
			temp = z;
		}

		return temp;

	}

	public static void main(String[] args) {
		SeatingCapacity sc = new SeatingCapacity();
		int l1 = 30;
		int l2 = 40;
		int l3 = 20;
		int capacity = sc.capacity(l1, l2, l3);
		if (capacity == l1) {
			System.out.println("L1 capacity is small");
		} else if (capacity == l2) {
			System.out.println("L2 capacity is small");
		} else {
			System.out.println("L3 capacity is small");
		}
	}

}
