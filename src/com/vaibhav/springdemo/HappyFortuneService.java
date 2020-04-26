package com.vaibhav.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() 
	{
		String[] arr = {"Nice Metting you","Have a good day","Good luck"};
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
		return arr[randomNumber];
	}

}
