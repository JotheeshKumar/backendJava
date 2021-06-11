package fullstackdev.development;

public class questiontwo {
	
	public void fuction() {
		String str= "vowleyEAuI";
		//String str = st.toLowerCase();
		
		int lcount=0;
		int ucount=0;
		   for(int i = 0; i < str.length(); i++) {  
			   
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
	                lcount++;  
	            }  
	            if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {  
	                ucount++;  
	            }  
		}
		
		System.out.println("lower = "+lcount);
		System.out.println("upper = "+ucount);
	}

	public static void main(String[] args) {
	
		questiontwo v= new questiontwo();
		v.fuction();
		
		
	}

}
