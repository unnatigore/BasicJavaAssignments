package com.basicjavaassignments;

import java.util.Scanner;
public class CalculatorAssignment
{
	static double addNumbers(double numberOne,double numberTwo)
	{
		return numberOne+numberTwo;
	}
	static double subtractNumbers(double numberOne,double numberTwo)
	{
		return numberOne-numberTwo;
	}
	static double multiplyNumbers(double numberOne,double numberTwo)
	{
		return numberOne*numberTwo;
	}
	static double divideNumbers(double numberOne,double numberTwo)
	{
		return numberOne/numberTwo;
	}
	public static void main(String args[])
	{
		int answer;
		System.out.println("Enter two numbers:");
		Scanner in=new Scanner(System.in);
		double numberOne=in.nextDouble();
		double numberTwo=in.nextDouble();

		addNumbers(numberOne,numberTwo);
		subtractNumbers(numberOne,numberTwo);
		multiplyNumbers(numberOne,numberTwo);
		divideNumbers(numberOne,numberTwo);
		System.out.println("Addition of numbers : "+addNumbers(numberOne,numberTwo));
		System.out.println("Subtraction of numbers : "+subtractNumbers(numberOne,numberTwo));
		System.out.println("Multiplication of numbers : "+multiplyNumbers(numberOne,numberTwo));
		System.out.println("Division of numbers : "+divideNumbers(numberOne,numberTwo));
	}
}
