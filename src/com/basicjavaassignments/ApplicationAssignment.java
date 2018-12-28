package com.basicjavaassignments;

import java.util.Scanner;
public class ApplicationAssignment 
{
	public static int loginCount=0;
	public static final String Username="unnatigore";
	public static final String Password="abc123";
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String username;
		String password;
		while(loginCount!=3)
		{
			System.out.println("Enter Username");
			username=sc.nextLine();
			System.out.println("Enter Password");
			password=sc.nextLine();

			
			if(LoginDetails(username,password))
			{
				System.out.println("Welcome");
				break;
			} 
			
		}
		if(loginCount==3)
		{
			System.out.println("Contact Admin");
		}
		
	}
	
	private static boolean LoginDetails(String username, String password2) 
	{
		if(username.equals(Username) && password2.equals(password2))
		{
			return true;
		}
		else
		{
			loginCount++;
			return false;
		}
	}

}
