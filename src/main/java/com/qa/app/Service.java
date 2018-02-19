package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	public Service()
	{}
	
	private Map<Integer,Account> accountMap = new HashMap<Integer,Account>();
	private int counter=0;
	
	public void addAccount(String firstName,String lastName,String accountNumber)
	{
		Account myAccount = new Account(firstName,lastName,accountNumber);
		accountMap.put(counter, myAccount);
		counter ++;
		
	}
	
	
	public void accountOutput()
	{
		for(int i=0; i< accountMap.size(); i++)
		{
			String firstName =accountMap.get(i).getFirstName();
			String lastName =accountMap.get(i).getLastName();
			String accountNumber =accountMap.get(i).getAccountNumber();
			
			System.out.println("Account No: "+accountNumber+" Name:"+firstName+" "+lastName);	
		}
	}

}
