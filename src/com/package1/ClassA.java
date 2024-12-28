package com.package1;

public class ClassA
{
	void msg()
	{
		System.out.println("My Name is Bhanu Prasad");
	}
	  
	public static void main(String[] args) 
	{
		int a=20;
		float b=20;//implicit conversion
		float d=33.9f;
		int c=(int)d;//explicit coversion
		char e='A';
		e=65;//ASCII
		//B=66
		//A=65
		int $f=20;
		int _123=30;//variable name should not start with digits
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(c);
		System.out.println(e);
		System.out.println($f);
		System.out.println(_123);	
	}
}
