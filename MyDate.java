package general;

import java.util.Scanner;

public class MyDate 
{
	public static Scanner key = new Scanner(System.in);
	
	private int day, mth, yr;
	
	public MyDate() 
	{
		super();
		day = 1;
		mth = 1;
		yr = 1;
	}

	public MyDate(int day, int mth, int yr) 
	{
		super();
		this.day = day;
		this.mth = mth;
		this.yr = yr;
	}

	public int getDay() 
	{
		return day;
	}

	public void setDay(int day) 
	{
		this.day = day;
	}

	public int getMth() 
	{
		return mth;
	}

	public void setMth(int mth) 
	{
		this.mth = mth;
	}

	public int getYr() 
	{
		return yr;
	}

	public void setYr(int yr) 
	{
		this.yr = yr;
	}
	
	public String toShortDate()
	{
		return String.format("%02d/%02d/%04d", this.day, this.mth, this.yr);
	}
	
	public String toMedDate()
	{
		String [] mthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		return String.format("%02d %4s %04d", this.day, mthNames[this.mth-1], this.yr);
	}
	
	public String toLongDate()
	{
		String [] mthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String suffix;
		
		switch(this.day)
		{
			case 1:
			case 21:
			case 31:
				suffix = "st";
			break;
			
			case 2:
			case 22:
				suffix = "nd";
			break;
			
			case 3:
			case 23:
				suffix = "rd";
			break;
			
			default:
				suffix = "th";
		}
		
		return String.format("%2d%s %s %04d", this.day, suffix, mthNames[this.mth-1], this.yr);
	}	
}

