import java.util.LinkedList;
import java.util.Scanner;


class SavingsAccount extends Account {
	
	public void makeWithdrawSA (int index, int money)
	{
		if (index>=accBalanceL.size())
		{
			System.out.println("Your account is already empty you can not withdraw more " );
		}
	}
	
	public double calculateZakat (int index1,int totalamt)
	{
		double Zakaat =0;
		//String storeTotal = accBalanceL.get(index1);
		//int i = Integer.parseInt(storeTotal);
		if (totalamt>=20000)
		{
			//double Zakaat ;
			Zakaat = (totalamt*2.5)/100;
			System.out.println("Deducting Zakaat... " + Zakaat );
		}
		
		else
			System.out.println("Balance is low than 20,000. Zakat can not be duducated. " );
		return Zakaat;
		
	}
	
	
	public double calculateInterest (int index1,int totalamt)
	{
		System.out.println("Assuming bank interest rate as 2.5");
		double inte = (totalamt*2.5)/100;
			System.out.println("Your Savings account interest has been calculated: " + inte  );
			return inte;
	}
}