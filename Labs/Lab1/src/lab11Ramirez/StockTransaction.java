package lab11Ramirez;

import javax.swing.*;

public class StockTransaction {
	public static void main (String[] args) {
		String strSharesPurchased, strSharesSold, strPurchasingPrice, strSellingPrice;
		int numSharesPurchased, numSharesSold;
		double purchasingPrice, sellingPrice, totalBought, totalSold, profitLoss, comissionBuy, comissionSale;
		final double BROKER_COMMISSION_RATE = 0.02;
		
		strSharesPurchased = JOptionPane.showInputDialog("What is the number of shares you purchased?");
		strPurchasingPrice = JOptionPane.showInputDialog("What was the purchasing price of the shares?");
		strSharesSold = JOptionPane.showInputDialog("What is the number of shares you sold?");
		strSellingPrice = JOptionPane.showInputDialog("What was the selling price of the shares?");
		
		numSharesPurchased = Integer.parseInt(strSharesPurchased);
		purchasingPrice = Double.parseDouble(strPurchasingPrice);
		numSharesSold = Integer.parseInt(strSharesSold);
		sellingPrice = Double.parseDouble(strSellingPrice);
		comissionSale =numSharesPurchased * purchasingPrice *BROKER_COMMISSION_RATE ;
		comissionBuy =numSharesSold * sellingPrice * BROKER_COMMISSION_RATE;
		totalBought = ( numSharesPurchased * purchasingPrice ) + comissionBuy ;
		totalSold= ( numSharesSold * sellingPrice ) + comissionSale;
		profitLoss = numSharesSold*sellingPrice - totalBought - comissionBuy ;
		
		JOptionPane.showMessageDialog(null, "You paid: $" + purchasingPrice + " for the stock "
				+ "\nYou paid your broker a comission of: $" + comissionBuy + " on the purchase." 
				+ "\nSo, you paid a total of: $" +  totalBought
				+ "\nYou sold the stock for: $" +  sellingPrice
				+ "\nYou paid your broker a comission of: $" + comissionSale + "on the sale." 
				+ "\nSo, you received a total of: $" +  totalSold
				+ "\nYour profit or loss:" +  profitLoss
				);
		
		
	 }
}
