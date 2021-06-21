package fullstackdev.development;

public class FrstAndLastCheck {

	int StringCheck(String check) {
		int n = 0;
		//check = "buto-generated method stub";
		String lowerCase = check.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		char first = charArray[0];
		char last = charArray[charArray.length - 1];
		if (first == last) {
			return 1;
		} else {
			return -1;
		}

	}

	public static void main(String[] args) {

FrstAndLastCheck sc=new FrstAndLastCheck();
String check = "the picture was great";
int stringCheck = sc.StringCheck(check);
System.out.println("Outpt: "+stringCheck);

	}

}
