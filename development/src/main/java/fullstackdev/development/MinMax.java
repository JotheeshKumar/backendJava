package fullstackdev.development;

import java.util.Arrays;
import java.util.Collections;

public class MinMax {

	void check(int[] i){
		int len=i.length;
			Arrays.sort(i);
			int min=i[0];
			int max=i[len-1];
			int sum= min+max;
			System.out.println("sum of min:"+min+" & max ="+max+" is "+ sum);
			
		
		
		
	}
	
	public static void main(String[] args) {
		MinMax sc = new MinMax();
		int[] check = {6,5,7,8,3,10,20,18,34};
		sc.check(check);
		
	}
	
}
