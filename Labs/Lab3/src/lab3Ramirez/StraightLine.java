package lab3Ramirez;
import javax.swing.*;
import java.text.*;
public class StraightLine {
	public static void main(String[] args) {
		double cost, residualValue, yearDep, accumDep=0, carryVal;
		int usefulLife;
		
		JTextArea myArea = new JTextArea();
		DecimalFormat myFormat = new DecimalFormat("0.00");
do
{
	cost =Double.parseDouble(JOptionPane.showInputDialog("Enter Cost (>0)"));
	if (cost <= 0)
		JOptionPane.showMessageDialog(null, "Cost should be more than 0","Error", JOptionPane.ERROR_MESSAGE);
}while(cost <= 0);
do
{
	residualValue =Double.parseDouble(JOptionPane.showInputDialog("Enter Residual Value (>=0 and <cost)"));
	if (residualValue > cost || residualValue < 0)
		JOptionPane.showMessageDialog(null, "Residual should be more than 0 and less than cost","Error", JOptionPane.ERROR_MESSAGE);
}while(residualValue < 0 || residualValue > cost);
do
{
	usefulLife =Integer.parseInt(JOptionPane.showInputDialog("Enter Useful Life(>0)"));
	if (usefulLife < 0)
		JOptionPane.showMessageDialog(null, "Useful Life should be more than 0","Error", JOptionPane.ERROR_MESSAGE);
}while(usefulLife < 0);
myArea.append("Depreciation Schedule" );
myArea.append("\n----------------------------------------------------" );
myArea.append("\nEnd of the Year \tCost \tYearly Depreciation \tAccumulated Depreciation \tCarrying Value" );
for ( int i = 1; i <= usefulLife;i++)
	{
	yearDep = (cost - residualValue)/usefulLife;
	accumDep+= yearDep;
	carryVal=cost-accumDep;
	myArea.append("\n"+i+"\t$"+myFormat.format(cost)+"\t$"+myFormat.format(yearDep)+"\t\t$"+myFormat.format(accumDep)+"\t\t$"+myFormat.format(carryVal) );
	}
JOptionPane.showMessageDialog(null, myArea,"Depreciation", JOptionPane.INFORMATION_MESSAGE);
	}
}
	
