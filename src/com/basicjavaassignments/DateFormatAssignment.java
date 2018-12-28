package com.basicjavaassignments;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateFormatAssignment 
{
	public static void main(String[] args) throws ParseException 
	{
		Scanner sc=new Scanner(System.in);
		String date;
		System.out.println("Please enter the date (dd,mm,yyyy)");
		date=sc.nextLine();
		System.out.println(convertDate(date));
	}
	private static String convertDate(String date) throws ParseException 
	{
		String pattern = "dd,mm,yyyy";
		SimpleDateFormat originalFormat = new SimpleDateFormat(pattern);
		SimpleDateFormat requiredFormat = new SimpleDateFormat("dd/MM/yyyy");
		return requiredFormat.format(originalFormat.parse(date));
	}
}