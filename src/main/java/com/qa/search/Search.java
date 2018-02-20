package com.qa.search;


import com.qa.service.Service;

public class Search {

	public int searchFirstname(String searchItem, Service myService) {
		// TODO Auto-generated method stub
		
		int result=0;
		
		
		for(int i=0;i< myService.getMap().size();i++)
		{
			
			if(myService.getAccount(i).getFirstName().equals(searchItem))
			{
				result++;
			}		
		}
		
		return result;
	}

}
