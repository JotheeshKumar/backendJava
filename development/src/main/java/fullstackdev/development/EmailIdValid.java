package fullstackdev.development;

public class EmailIdValid {
	
	boolean validator(String email) {
		String input1=email;
		System.out.println("emailid : "+input1);
		
		String[] check1=input1.split("@");
		int lengthAT = check1.length;
		System.out.println("length @ : "+lengthAT);
		
		String[] check2=input1.split("\\.");
		int lengthDot = check2.length;
		System.out.println("length . : "+lengthDot);
		boolean atDot= (lengthAT==lengthDot)?true:false;
		System.out.println("atdot is : "+ atDot);
		
		int lengthBeforeAt = check1[0].length();
		System.out.println("length before @ : "+lengthBeforeAt);
		boolean bfrAt= (lengthBeforeAt>=3)?true:false;
		
		boolean checkCom = check2[1].equalsIgnoreCase( "com");
		System.out.println("checkCom is :"+ checkCom);
		
		String btwn= input1.substring(input1.indexOf("@")+1,input1.indexOf("."));
		int btwnLen=btwn.length();
		System.out.println("btwn length is : "+ btwnLen);
		
		boolean btwnAtDot= (btwnLen>=4)?true:false;
		System.out.println("btwnAtDot is :"+ btwnAtDot);
		
		if(atDot && bfrAt && checkCom && btwnAtDot) {
			return true;
		} else {
			return false;
		}
	
	}

	public static void main(String[] args) {
		EmailIdValid sc = new EmailIdValid();
		String emailId = "fdfjw@hot.com";
		boolean validator = sc.validator(emailId);
		if (validator) {
			System.out.println("the given emailId : "+ emailId +" is valid" );
		}else {
			System.out.println("the given emailId : "+ emailId +" is not valid" );
		}
		
		
	}

}
