package com.qa.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.qa.service.Service;
import com.qa.util.JSONUtil;

import junit.framework.Assert;

public class AccountSearchTest {

	Search accountSearcher;
	
	@Before
	public void init()
	{
		Service myService= new Service();
		
		myService.addAccount("Sean", "McGee", "SM001");
		myService.addAccount("Niall", "Mulready", "SM002");
		myService.addAccount("Ian", "Cunningham", "CM001");
		myService.addAccount("Breandan", "Green", "SM003");
	}
	
	@Test
	public void searchTest() {
		int result=accountSearcher("Sean");
		
		Assert.assertEquals(1, result);
		
		fail("Not yet implemented");
	}

}
