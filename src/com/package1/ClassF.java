package com.package1;

public class ClassF 
{
	public static void main(String[] args) 
	{
	    // --> Logical Operator
	   int a=10,b=5,c=3;
	   //System.out.println(a>b && a<c);//t f=f
	   //System.out.println(a>b || a<c);//t f=t
	   //System.out.println(a|c);//1010 0011=1011=11
	   //System.out.println(a&c);//1010 0011=0010=2
	   
	   
	   // -->Bitwise operator & Logical Operator
	   //System.out.println(a<b && a++ >b);//f t=f
	   //System.out.println(a);//10
	   //System.out.println(a<b & a++ >b);//f t= f
	   //System.out.println(a);//11
	   
	   // --> Bitwise operator & Logical operator || or |
	   System.out.println(a>b || a++<b);//t f=t
	   System.out.println(a);//10
	   System.out.println(a>b | a++<b);//t f=t
	   System.out.println(a);//11
	   
	}
	
}


