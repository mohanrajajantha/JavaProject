package com.wipro.bank.main;

import java.util.Scanner;

import com.wipro.bank.service.BankService;


public class MainClass {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter tenure:");
		int tenure=input.nextInt();
		System.out.println("Enter principal:");
		float principal=input.nextFloat();
		System.out.println("Enter age:");
		int age=input.nextInt();
		System.out.println("Enter gender:");
		String gender=input.next();
		gender=gender.toLowerCase();
		BankService b=new BankService();
		b.calculate(principal, tenure, age, gender);
	}

}
