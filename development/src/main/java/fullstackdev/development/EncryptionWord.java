package fullstackdev.development;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class EncryptionWord {
	String con = "abcdefghijklmnopqrstuvwxyz";

	StringBuilder sbf = new StringBuilder();

	public void encrypt() {
		char[] alpa = con.toCharArray();
		String st = "curiosity";
		char[] charArray = st.toCharArray();
		LinkedList<Character> encrypted = new LinkedList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			loopA:

			if ((i + 1) % 2 != 0) {
				for (int k = 0; k <= alpa.length - 1; k++) {
					if (charArray[i] == 'z') {
						sbf.append('a');
						break loopA;
					} else {

						if (charArray[i] == alpa[k]) {
							sbf.append(alpa[k + 1]);
							break loopA;
						}
					}

				}

			} else {
				sbf.append(charArray[i]);
			}
		}
		System.out.println(sbf);

	}

	public static void main(String[] args) {
		EncryptionWord sc = new EncryptionWord();
		sc.encrypt();
	}

}
