package fullstackdev.development;

public class StringReplace {

	String replaceWord(String para, String newWord, String oldWord) {
	 
		String replaceAll = para.replaceAll(oldWord, newWord);
		return replaceAll;
	}
	
	public static void main(String[] args) {
		
		StringReplace sc = new StringReplace();
		String para="Enter the content of the document ITT is a private organisation. \r\n" + 
				" \r\n" + 
				" ITT is a product based company.\r\n" + 
				"\r\n" + 
				" DBox is a ITT product ";
		String newWord="TTT";
		String oldWord="ITT";
		
		String modifiedPara = sc.replaceWord(para, newWord, oldWord);
		System.out.println("New modifed Draft: \n"+ modifiedPara);
		

	}

}
