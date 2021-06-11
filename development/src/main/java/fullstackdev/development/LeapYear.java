package fullstackdev.development;

public class LeapYear {

	boolean leapCal(int year) {

		boolean divSec = true;
		boolean isLeapYear;
		boolean divTwo = (year % 4 == 0 ) ? true : false;
		if(year%100==0) {
			divSec = (year % 100 == 0 && year % 400 == 0) ? true : false;
		}
	
		if (divTwo && divSec) {
			 isLeapYear=true;
			return isLeapYear;

		} else {
			 isLeapYear=false;
			return isLeapYear;
		}

	}

	public static void main(String[] args) {

		int year=2020;
		LeapYear sc = new LeapYear();
		boolean leapCal = sc.leapCal(year);
		System.out.println("given year "+year+" is leap year : "+ leapCal);
		
		
	}

}
