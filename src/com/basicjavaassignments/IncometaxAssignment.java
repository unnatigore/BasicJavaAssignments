package com.basicjavaassignments;

import java.util.Scanner;

public class IncometaxAssignment
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CTC : ");
		double CTC=sc.nextDouble();
		double incometax;
		
		if(CTC>60 && CTC<=180000 )
		{
			incometax=0;
			System.out.println("Income tax for slab A="+incometax);
		}
		
		if(CTC>180001 && CTC<=300000 )
		{
			incometax=0.1*CTC;
			System.out.println("Income tax for slab B="+incometax);
		}
		
		if(CTC>300001 && CTC<=500000 )
		{
			incometax=0.3*CTC;
			System.out.println("Income tax for slab C="+incometax);
		}
		
		if(CTC>500001 && CTC<=1000000 )
		{
			incometax=0.5*CTC;
			System.out.println("Income tax for slab D="+incometax);
		}
		
		
	}
}