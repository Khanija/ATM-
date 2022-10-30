package com.project;

public class Menu {
	
	public double AvailableBalance;
	public double WithDrawAmount;
	public double DepositAmount;
	
	//Default Constructor
	public Menu()
	{
		
	}

    //setter getter
	public double getAvailableBalance() 
	{
		return AvailableBalance;
	}


	public void setAvailableBalance(double availableBalance) 
	{
		AvailableBalance = availableBalance;
	}


	public double getWithDrawAmount() {
		return WithDrawAmount;
	}


	public void setWithDrawAmount(double withDrawAmount) 
	{
		WithDrawAmount = withDrawAmount;
	}


	public double getDepositAmount() 
	{
		return DepositAmount;
	}


	public void setDepositAmount(double depositAmount)
	{
		DepositAmount = depositAmount;
	}
	
	
 
}
