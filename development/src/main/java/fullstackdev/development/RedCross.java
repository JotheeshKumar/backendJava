package fullstackdev.development;

import java.util.Arrays;
import java.util.Scanner;

public class RedCross {
	int tPeople=0;
	int tPeople1=0;
	int tPeople2=0;
	int peopleCount(int tentDetails[]){
		
		for(int i=0;i<=tentDetails.length-1;i++) {
			tPeople+=tentDetails[i];
		}
		
		
		return tPeople;
		
	}
int peopleCountWhile(int tentDetails[]){
		int n=0;
		while(n<tentDetails.length) {
			tPeople1+=tentDetails[n];
			n++;
		}
		
		
		return tPeople1;
		
	}
int peopleCountFore(int tentDetails[]){
	
	for (int i : tentDetails) {
		tPeople2+=i;
	}
	
	
	return tPeople2;
	
}
	
	void dispdetails(int tentDetails[]){
		System.out.println(Arrays.toString(tentDetails)
				.replace("[", "")
				.replace("]", "").replace(",", " "));
	}

	public static void main(String[] args) {
		RedCross sc= new RedCross();
		Scanner scin= new Scanner(System.in);
		int n;
		System.out.println("number of tents in the camp:");
		n=scin.nextInt();
		int tentDetails[] = new int[n];
		
		for(int i=0;i<=n-1;i++) {
			System.out.println("Enter the number of person in tent no "+i+" :");
			tentDetails[i] = scin.nextInt();
		}
		
		int peopleCount = sc.peopleCount(tentDetails);
		int peopleCount1 = sc.peopleCountWhile(tentDetails);
		int peopleCount2 = sc.peopleCountFore(tentDetails);
		System.out.println("Tent details :");
		sc.dispdetails(tentDetails);
		
		System.out.println("Total people count in all tents :"+peopleCount);
		System.out.println("Total people count in all tents :"+peopleCount1);
		System.out.println("Total people count in all tents :"+peopleCount2);
	}

}
