package com.wipro.bank.main;

import java.util.Scanner;

import com.wipro.bank.service.BankService;

public class MainClass {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int tenure=input.nextInt();
		float principal=input.nextFloat();
		int age=input.nextInt();
		String gender=input.next();
		gender=gender.toLowerCase();
		BankService b=new BankService();
		b.calculate(principal, tenure, age, gender);
	}

}
