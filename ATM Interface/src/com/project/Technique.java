package com.project;

import java.util.HashMap;
import java.util.Map;

public class Technique implements Operation{

	Menu m = new Menu();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	Map<Double,String> MiniStatement = new HashMap();
	
	@Override
	public void AvailableBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance : "+m.getAvailableBalance());
		
	}

	@Override
	public void WithDrawAmmount(double WithDrawAmount) {
		// TODO Auto-generated method stub
		if(WithDrawAmount<=m.getAvailableBalance())
		{
			MiniStatement.put(WithDrawAmount,"Amount withdrawn");
			System.out.println("collect your cash "+WithDrawAmount);
			m.setAvailableBalance(m.getAvailableBalance()-WithDrawAmount);
			AvailableBalance();
		}
		else
		{
			System.out.println("Insufficient amount to withdraw.");
			AvailableBalance();
		}
		
	}

	@Override
	public void DepositAmount(double DepositAmount) {
		// TODO Auto-generated method stub
		MiniStatement.put(DepositAmount,"Amount Desposited");
		System.out.println(DepositAmount +" deposited successfully");
        m.setAvailableBalance(m.AvailableBalance+DepositAmount);
        AvailableBalance();
		
	}

	@Override
	public void MiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String> m:MiniStatement.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		AvailableBalance();
		
	}
}
