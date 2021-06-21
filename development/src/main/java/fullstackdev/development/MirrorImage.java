package fullstackdev.development;

public class MirrorImage {
	
	@SuppressWarnings("null")
	String getImage(String nrmlString){
		String st="";
		StringBuilder invertedImage = null;
		char[] nrmlChar = nrmlString.toCharArray();
		for(int i=nrmlChar.length-1;i>=0;i-- ) {
			st+=nrmlChar[i];
		}
		
		String finalWrd=nrmlString+"|"+st;
		
		
		return finalWrd;
		
	}

	public static void main(String[] args) {
		MirrorImage sc= new MirrorImage();
		String image = sc.getImage("EARTH");
		System.out.println("inverted word is : "+ image);

	}

}
