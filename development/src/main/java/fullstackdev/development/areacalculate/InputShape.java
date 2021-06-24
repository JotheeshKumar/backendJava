package fullstackdev.development.areacalculate;

import java.util.Scanner;

public class InputShape {

	public static void main(String[] args) {
		int choice;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("1.Rectangle 2.Square 3.Circle 4. Hexagon Area Calculator --- Choose your shape");

			choice = scan.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter length and breadth:");
				Shape rectangle = new Rectangle(scan.nextInt(), scan.nextInt());
				System.out.println("Area of " + rectangle.getShapeName() + " : " + rectangle.calculateArea());
				break;
			case 2:
				System.out.println("Enter side:");
				Shape square = new Square(scan.nextInt());
				System.out.println("Area of " + square.getShapeName() + " : " + square.calculateArea());
				break;
			case 3:
				System.out.println("Enter radius:");
				Shape circle = new Circle(scan.nextInt());
				System.out.println("Area of " + circle.getShapeName() + " : " + circle.calculateArea());
				break;
			case 4:
				System.out.println("Enter side:");
				Shape hexagon = new Hexagon(scan.nextInt());
				System.out.println("Area of " + hexagon.getShapeName() + " : " + hexagon.calculateArea());
				break;
			default:
				System.out.println("enter valid shape index....");
				break;

			}
		} while (choice < 4);

		scan.close();
	}

}
