package com;

public class Factorial {

	public static void main(String[] args) {
		int i;
		int count=5,fact=1;
		for(i=1;i<=count;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of"+count+"is:"+fact);

	}

}
