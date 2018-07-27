package com.wipro.bank.acc;

public class RDAccount extends Account
{
	public RDAccount(int tenure,float principal)
	{
		this.tenure=tenure;
		this.principal=principal;
	}
	public float calculateAmountDeposited() 
	{		
		return (principal*tenure*12);
	}
	public float calculateInterest() 
	{
		float i;
		i=(float) (principal*(Math.pow(1+(rateOfInterest/400),(4*tenure))-1));
		return i;
	}
}
