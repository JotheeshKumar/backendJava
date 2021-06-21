package fullstackdev.development;

public class ProfitLoss {
	
	double profitOrLoss(double buyingPrice, double sellingPrice){
		if(buyingPrice>sellingPrice) {
			double lossVal=buyingPrice-sellingPrice;
			double percentCal = PercentCal(lossVal,buyingPrice);
			return percentCal;
		}else {
			double profitVal=sellingPrice-buyingPrice;
			double percentCal = PercentCal(profitVal,buyingPrice);
			return percentCal;
		}
		
	}
	double PercentCal(double calValue, double costPrice) {
		
		double percent= 100*(calValue/costPrice);
		return percent;
	}

	public static void main(String[] args) {

		double buyingPrice = 20.54; 
		double sellingPrice = 30.50;
		ProfitLoss sc = new ProfitLoss();
		double profitOrLoss = sc.profitOrLoss(buyingPrice, sellingPrice);
		if(buyingPrice>sellingPrice) {
			System.out.println("percentage of loss:  "+Math.round(profitOrLoss)+"%");
		}else {
			System.out.println("percentage of profit:  "+Math.round(profitOrLoss)	+"%");
		}
		

	}

}
