package com.package1;

public class ClassD 
{
    public static void main(String[] args) {
		//shift operator
    	//int a=10;
    	//System.out.println(a<<2);//10*2^2=10*4=40
    	//001010 00=40
    	//System.out.println(a>>2);//10/2^2=10/4=2
    	//000010 =2
    	int a=-10;
    	System.out.println(a<<2);//-10*2^2=-10*4=-40
    	System.out.println(a>>2);//-3
    	//01010
    	//10101=1=  10110>>2
    	// 1  1  1 0  1=
       // -16 8  4 2  1=-3
	}
}
