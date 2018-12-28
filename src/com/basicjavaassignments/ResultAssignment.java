package com.basicjavaassignments;

import java.util.Scanner;

public class ResultAssignment
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks in first subject: ");
		int subjectOne=s.nextInt();
		System.out.println("Enter the marks in second subject: ");
		int subjectTwo=s.nextInt();
		System.out.println("Enter the marks in third subject: ");
		int subjectThree=s.nextInt();

		if(subjectOne>60 && subjectTwo>60 && subjectThree>60)
		System.out.println("You are Passed");
		
		else if(subjectOne>60 && subjectTwo>60 && subjectThree<60 || subjectOne>60 && subjectTwo<60 && subjectThree>60 || subjectOne<60 && subjectTwo>60 && subjectThree>60 )
		System.out.println("You are promoted");
		
		else if(subjectOne>60 && subjectTwo<60 && subjectThree<60 || subjectOne<60 && subjectTwo>60 && subjectThree<60 || subjectOne<60 && subjectTwo<60 && subjectThree>60 || subjectOne <60 && subjectTwo<60 && subjectThree<60) 
		System.out.println("Unfortunately...........you are failed");
		
	}
}