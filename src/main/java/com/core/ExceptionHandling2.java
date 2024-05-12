package com.core;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int a=5;
		int b=0;
		int c=a/b;
		System.out.println("C Value is ");
	}
catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	}

}
