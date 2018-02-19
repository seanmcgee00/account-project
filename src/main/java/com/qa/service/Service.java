package com.qa.service;

// service

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
	
	public Map<Integer,Account> getMap()
	{
		return accountMap;
	}
	
	
	public void addAccount(String firstName,String lastName,String accountNumber)
	{
		Account myAccount = new Account(firstName,lastName,accountNumber);
		accountMap.put(counter, myAccount);
		counter ++;
		
	}	
	
	public void addAccount(Account myAccount)
	{
		accountMap.put(counter, myAccount);
		counter ++;
		
	}	
	
	
	
	
	/*public int searchFirstname(String searchItem) {
		// TODO Auto-generated method stub
		
		int result=0;
		
		for(Account eachAccount: accountMap.values())
		{
			if(eachAccount.getFirstName().equals(searchItem))
			{
				result++;
			}
		}
		
		return result;
	}
	
	*/
	
	public int searchFirstname(String searchItem) {
		// TODO Auto-generated method stub
		
		return (int) accountMap.values().stream().filter(eachAccount -> eachAccount.getFirstName().equals(searchItem)).count();
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
		
	
	public void accountOutputJson(Account myAccount)
	{
		Gson gsonAccount= new GsonBuilder().create();
		System.out.println( gsonAccount.toJson(myAccount));
		
	}
	
	public void allAccountsOutput(String type)
	{
		for(int index=0; index< accountMap.size(); index++)
		{
			if (type.equals("json"))
			{accountOutputJson(getAccount(index));}
			else
			{accountOutput(getAccount(index));}
		}
	}
	
	
	

	
	
	
	
	

}
