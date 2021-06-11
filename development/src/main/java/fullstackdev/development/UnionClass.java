package fullstackdev.development;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionClass {
	Set<Integer> union = new HashSet<Integer>();

	void unionMethod(int[] a, int[] b) {

		for (int is : a) {
			union.add(is);
		}
		for (int is : b) {
			union.add(is);
		}

	}

	void display() {

		System.out.print(union.toString());

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		UnionClass sc = new UnionClass();
		sc.unionMethod(a, b);
		sc.display();
	}
}
