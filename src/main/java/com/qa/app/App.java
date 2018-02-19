package com.qa.app;

import com.qa.service.Service;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Service myService= new Service();
		
		myService.addAccount("Sean", "McGee", "SM001");
		myService.addAccount("Niall", "Mulready", "SM002");
		myService.addAccount("Ian", "Cunningham", "CM001");
		myService.addAccount("Breandan", "Green", "SM003");
		
		myService.allAccountsOutput();
		
		System.out.println("------------------");
		
		myService.allAccountsOutputJson();

	}

}
