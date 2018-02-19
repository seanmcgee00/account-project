package com.qa.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.qa.service.Service;

import junit.framework.Assert;

public class AccountSearchTest {

	Search accountSearcher= new Search();
	Service myService= new Service();
	@Before
	public void init()
	{	
		myService.addAccount("Sean", "McGee", "SM001");
		myService.addAccount("Niall", "Mulready", "SM002");
		myService.addAccount("Ian", "Cunningham", "CM001");
		myService.addAccount("Breandan", "Green", "SM003");
	}
	
	@Test
	public void searchTest() {
		int result=accountSearcher.searchFirstname("Sean",myService);
		Assert.assertEquals(1, result);		
	}

}
