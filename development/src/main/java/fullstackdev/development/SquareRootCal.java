package fullstackdev.development;

public class SquareRootCal {

	double calculation(double x1, double x2, double y1, double y2) {
		double i =  ((x1 + x2) * (x1 + x2));
		double j =  ((y1 + y2) * (y1 + y2));
		double finl= i+j;
		return finl;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1=5;
		double x2=6; 
		double y1=8; 
		double y2=3;
		SquareRootCal sc = new SquareRootCal();
		double sqrt = sc.calculation(x1, x2, y1, y2);
		System.out.println("sqrt = "+ (int)Math.sqrt(sqrt));
		
		
		
	}

}
