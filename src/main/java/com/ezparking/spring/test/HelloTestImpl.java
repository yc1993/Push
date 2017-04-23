package com.ezparking.spring.test;

public class HelloTestImpl implements HelloTest {
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloTestImpl(){}
	
	public HelloTestImpl(String message){
		this.message = message;
	}
	
	public void sayHello() {
		System.out.println(message);
	}

}
