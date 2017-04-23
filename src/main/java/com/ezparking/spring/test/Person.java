package com.ezparking.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
//	@Resource
	@Autowired(required=false)@Qualifier("helloWithParam")
	private HelloTest ht;
	
	public void action(){
		
		ht.sayHello();
	}
}
