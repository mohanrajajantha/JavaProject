package com.wipro.bank.acc;

public abstract class Account 
{
	int tenure;
	float principal;
	float rateOfInterest;
	public void setInterest(int age, String gender)
	{
		if(gender.equals("Male")||gender.equals("male")||gender.equals("MALE"))
		{
			if(age<60)
				rateOfInterest=(float) 9.8;
			else
				rateOfInterest=(float) 10.5;
		}
		else if(gender.equals("Female")||gender.equals("female")||gender.equals("FEMALE"))
		{
			if(age<58)
				rateOfInterest=(float) 10.2;
			else
				rateOfInterest=(float) 10.8;
		}
	}
	public float calculateMaturityAmount(float totalPrincipalDeposited,float maturityInterest)
	{
		return totalPrincipalDeposited+maturityInterest;
	}
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();
}
