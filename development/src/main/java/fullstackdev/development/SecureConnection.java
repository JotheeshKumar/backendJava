package fullstackdev.development;

public class SecureConnection {

	boolean isSecureURL(String url) {

		String[] split = url.split(":");
		String string = split[0].trim();
		boolean checkVal = string.equalsIgnoreCase("https");
		return checkVal;
	}

	public static void main(String[] args) {
		SecureConnection sc = new SecureConnection();
		String url = " https://www.amazon.com/";
		boolean checkUrl = sc.isSecureURL(url);
		if (checkUrl) {
			System.out.println("Entered URL: " + url + " is starting with https so secure ");
		} else {
			System.out.println("Entered URL: " + url + " is starting with http so not secure ");

		}

	}

}
