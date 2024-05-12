package com.core;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= {10,20,30,40,50,60};
			for (int i=0;i<a.length;i++)
			{
			System.out.println(a[i]);
		}
		}
	catch(Exception e)
		{
		e.printStackTrace();
		System.out.println(e.getMessage());
		}
	}

}
