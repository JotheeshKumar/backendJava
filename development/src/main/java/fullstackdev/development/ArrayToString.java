package fullstackdev.development;

public class ArrayToString {
	
	String convert(String[] input1) {
		
		
		String start=input1[0];
		for(int i =1; i<=input1.length-1;i++) {
			start=start+","+input1[i];
		}
		
		return start;
	}

	public static void main(String[] args) {

		String[] input1= {"Vikas","Lokesh","Ashok"};
		ArrayToString sc = new ArrayToString();
		String convert = sc.convert(input1);
		System.out.println("converted string is :"+convert);
		
		
	}

}
