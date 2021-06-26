package fullstackdev.development.q42;

public class Delivery {

	void displayDeliveryDetails(String bowler, String batsman) {
		System.out.println("Batsman : " + batsman + "\n" + "Bowler : " + bowler);

	}

	void displayDeliveryDetails(long runs) {

		switch ((int) runs) {
		case 4:
			System.out.println("It is a boundary.");
			break;
		case 6:
			System.out.println("It is a Sixer.");
			break;
		default:
			System.out.println("Run obtained is " + (int) runs);
			break;
		}

	}

}
