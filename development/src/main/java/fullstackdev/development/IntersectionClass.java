package fullstackdev.development;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class IntersectionClass {

	
	Set<Integer> intrsc= new HashSet<Integer>();
	void inter(int[] a,int[] b) {
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<b.length;j++) {
				if(a[i]==b[j]) {
					intrsc.add(a[i]);
				}
			}
		}
		
		
	}
	void display() {

		System.out.print(intrsc.toString());

	}
	public static void main(String[] args) {
		
		int[] a={1,2,3,4}; int[] b={3,4,5,6};
		IntersectionClass sc = new IntersectionClass();
		sc.inter(a, b);
		sc.display();
	}

}
