package fullstackdev.development.q42;

import java.util.Scanner;

public class CommentaryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu 1.Player details of the delivery \n 2.Run details of the delivery");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the bowler name");
				String bowler = scan.next();
				System.out.println("Enter the batsman name");
				new Delivery().displayDeliveryDetails(bowler, scan.next());
				break;
			case 2:
				System.out.println("Enter the number of runs");
				new Delivery().displayDeliveryDetails(scan.nextLong());

				break;
			default:
				System.out.println("Enter valid option");
				break;
			}

		} while (choice < 3);
		scan.close();
	}

}
