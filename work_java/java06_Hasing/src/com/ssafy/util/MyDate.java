package com.ssafy.util;

public class MyDate {
	int year;
	int month;
	int day;
	
	public void setDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String getDate()
	{
		return year+"."+month+"."+day;
	}
}
