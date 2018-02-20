package com.qa.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.account.Account;
import com.qa.service.Service;

import junit.framework.Assert;

public class AccountSearchTest {

//	private Search accountSearcher;
	private Service myService;
	private Account johnBloggs;
	private Account janeDoe;
	private Account johnGordon;
	
	@Before
	public void init()
	{	
		myService= new Service();
	//	accountSearcher= new Search();
		johnBloggs= new Account("John", "Bloggs", "SM001");
		janeDoe= new Account("Jane", "Doe", "SM002");
		johnGordon= new Account("John", "Gordon", "SM003");
	}
	
	@Test
	public void searchTest() {
		myService.addAccount(johnBloggs);
		myService.addAccount(janeDoe);
		myService.addAccount(johnGordon);
	//	int result=accountSearcher.searchFirstname("John",myService);
		int result=myService.searchFirstname("John");
		Assert.assertEquals(2, result);		
	}

}
