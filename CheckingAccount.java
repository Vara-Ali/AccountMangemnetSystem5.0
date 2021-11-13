import java.util.LinkedList;
import java.util.Scanner;


class CheckingAccount extends Account {
	
	public boolean makeWithdrawAC (int index, int money)
	{
		//int retInt = Integer.parseInt(accBalanceL.get(index));
		if (index>=accBalanceL.size())
		{
			System.out.println("Your account is already empty can withdraw 5000 PKR maximum " );
			return false;
		}
		else
		{
		//	int remaining = retInt - money;
			System.out.println("Amount from your account has been withdrwan " );
			return true;
		}
	}

	public void displayAllDeductions()
	{
		System.out.println("Following are all the deductions from Checking Account" );
	}
	
}