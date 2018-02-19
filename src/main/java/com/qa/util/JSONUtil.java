package com.qa.util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.qa.service.Service;

public class JSONUtil {
	Gson gsonAccount;
	public JSONUtil()
	{
		gsonAccount= new GsonBuilder().create();
	}
	
	
	public String accountOutputJson(Service myService)
	{
	
		String output = gsonAccount.toJson(myService);
		return output;
		
	}

}
