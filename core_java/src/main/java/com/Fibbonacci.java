package com;

public class Fibbonacci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=10,i;
		System.out.print(n1+""+n2);
		for(i=2;count<=100;++i)
		{
			n3=n1+n2;
			System.out.print(""+n3);
			n1=n2;
			n2=n3;
		}
		
		
		
		
		

	}

}
