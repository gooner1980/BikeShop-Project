package general;

import java.util.*;

public class MyTime 
{
	public static Scanner key = new Scanner(System.in);
	
	private int hrs, mins, secs;
	
	public MyTime() 
	{
		super();
		hrs = 0;
		mins = 0;
		secs = 0;
	}
	
	public MyTime(int hrs, int mins, int secs) 
	{
		super();
		this.hrs = hrs;
		this.mins = mins;
		this.secs = secs;
	}

	public int getHrs() 
	{
		return hrs;
	}

	public void setHrs(int hrs) 
	{
		this.hrs = hrs;
	}

	public int getMins() 
	{
		return mins;
	}

	public void setMins(int mins) 
	{
		this.mins = mins;
	}

	public int getSecs() 
	{
		return secs;
	}

	public void setSecs(int secs) 
	{
		this.secs = secs;
	}

	public String to24String() 
	{
		return String.format("%02d:%02d:%02d", this.hrs, this.mins, this.secs );
	}
	
	//public String to12String()
	//{
		//String.format("%02d:%02d:%02d %s", ((hrs == 0 || hrs == 12 ) ? );
	//}
	
	
}

