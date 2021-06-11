package fullstackdev.development;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueWords {
	Set<Character> uni =new LinkedHashSet<Character>();
	void uniqe(String st) {
		
		// st= "helloworld";
		char[] charArray = st.toCharArray();
		for(int i =0;i<=charArray.length-1;i++) {
			uni.add(charArray[i]);
		}
		
	}
	
	void disp() {
		System.out.println("unique letters: ");
		for (Character character : uni) {
			System.out.print(character);
		}
		
	}
	
	public static void main(String[] args) {
		String st= "nnqqdfgfffdjshjbqhdfnfghwwfwbh";
		UniqueWords sc = new UniqueWords();
		sc.uniqe(st);
		sc.disp();
	}
}
