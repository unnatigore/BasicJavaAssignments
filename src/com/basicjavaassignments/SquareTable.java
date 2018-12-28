package com.basicjavaassignments;

public class SquareTable 
{ 	
	public static void main(String [] args)
	{
		int num=5,multiplication,square,i;
		for(i=1;i<=10;++i)
		{
			multiplication=num*i;
			square=multiplication*multiplication;
			System.out.printf("%d * %d =%d_______%d\n " ,num,i,multiplication,square);
		}
	}
}