package fianlRamirez;

public class Registration {
	final private double GEN_REG=699,STU_REG=499, ECOMM=295,WEB=295,JAVA=395,SECURITY=349;
	private double total;
 public Registration() {
	 total = 0;
 }
 public void setRegistrationCost(int a) {
	 if (a==1) {
		 total+=GEN_REG;
	 }
	 else
		 total+=STU_REG;
 }
 public void setWorkShopCost(int wsIndex) {
	 if (wsIndex==0)
		 total+=ECOMM;
	 else if(wsIndex==1)
		 total+=WEB;
	 else if(wsIndex==2)
		 total+=JAVA;
	 else
		 total+=SECURITY;
 }
 public double getTotal() {
	 return total;
 }
}
