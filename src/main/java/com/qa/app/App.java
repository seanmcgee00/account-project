package com.qa.app;

import com.qa.search.Search;

//app

import com.qa.service.Service;
import com.qa.util.JSONUtil;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Service myService= new Service();
		JSONUtil convertor = new JSONUtil();
		
		myService.addAccount("Sean", "McGee", "SM001");
		myService.addAccount("Niall", "Mulready", "SM002");
		myService.addAccount("Ian", "Cunningham", "CM001");
		myService.addAccount("Breandan", "Green", "SM003");
		
		myService.allAccountsOutput("java");
		
		System.out.println("--------------------");
		
		myService.allAccountsOutput("json");
		
		System.out.println("--------------------");
		
		System.out.println(convertor.accountOutputJson(myService));
		
		
		
		Search accountSearch = new Search();
		int result=accountSearch.searchFirstname("Sean", myService);
		System.out.println("result="+result);

	}

}
