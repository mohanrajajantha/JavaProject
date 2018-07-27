package com.wipro.bank.service;

import com.wipro.bank.acc.BankValidationException;
import com.wipro.bank.acc.RDAccount;

public class BankService {
	public boolean validateData(float principal, int tenure,int age, String gender)
	{
		try
		{
			if(principal>=500&&(tenure==5||tenure==10)&&(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female"))&&(age>1||age<100))
			{
				return true;
			}
			else
			{
				BankValidationException B=new BankValidationException();
				Sout(B.toString());
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			return false;
		}
		return false;
	}
	public void calculate(float principal,int tenure, int age, String gender)
	{
		if(validateData(principal,tenure,age,gender))
		{
			RDAccount RD=new RDAccount(tenure,principal);
			RD.setInterest(age, gender);
			System.out.println(RD.calculateInterest());
			System.out.println(RD.calculateAmountDeposited());
			System.out.println(RD.calculateMaturityAmount(20*principal,RD.calculateInterest()));
		}
	}
}
