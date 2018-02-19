package com.qa.service;

import java.util.HashMap;
import java.util.Map;
import com.qa.account.Account;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Service {
	
	
	private Map<Integer,Account> accountMap;
	private int counter=0;
	
	public Service()
	{
		accountMap = new HashMap<Integer,Account>();
	}
	
	
	public Account getAccount(int index)

	{
		return accountMap.get(index);
		
	}
	
	
	public void addAccount(String firstName,String lastName,String accountNumber)
	{
		Account myAccount = new Account(firstName,lastName,accountNumber);
		accountMap.put(counter, myAccount);
		counter ++;
		
	}
	
	
	public void accountRemoval(int index)
	{
		accountMap.remove(index);
	}
	
	
	public void accountOutput(Account myAccount)
	{
		String firstName =myAccount.getFirstName();
		String lastName =myAccount.getLastName();
		String accountNumber =myAccount.getAccountNumber();
		
		System.out.println("Account No: "+accountNumber+" Name:"+firstName+" "+lastName);
	}
	
	
	
	
	public void accountsOutputJson(int index)
	{
		Gson gsonAccount= new GsonBuilder().create();
		System.out.println( gsonAccount.toJson(getAccount(index)));
		
	}
	
	public void allAccountsOutput()
	{
		for(int index=0; index< accountMap.size(); index++)
		{
			accountOutput(getAccount(index));
		}
	}
	
	
	public void allAccountsOutputJson()
	{
		for(int index=0; index< accountMap.size(); index++)
		{
			accountsOutputJson(index);
			
		}
	}
	
	
	
	
	

}
