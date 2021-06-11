package fullstackdev.development;

import java.util.HashSet;
import java.util.Set;

public class InterUnion {

	Set<Integer> union = new HashSet<Integer>();
	Set<Integer> intrsc = new HashSet<Integer>();

	void unionMethod(int[] a, int[] b) {
		for (int is : a) {
			union.add(is);
		}
		for (int is : b) {
			union.add(is);
		}
	}

	void inter(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					intrsc.add(a[i]);
				}
			}
		}
	}

	void display() {
		System.out.println("union of two arrays : " + union.toString());
		System.out.println("intersection of two arrays : " + intrsc.toString());
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		InterUnion sc = new InterUnion();
		sc.inter(a, b);
		sc.unionMethod(a, b);
		sc.display();
	}

}
