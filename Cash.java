package assignmentQ2;

import general.*;

public class Cash extends Transaction
{
	public double discountRate;

	public Cash() 
	{
		super();
		discountRate = 0.00;
	}
	
	public Cash(int transNo, MyProduct product, int qty) 
	{
		super(transNo, product, qty);
		this.discountRate = discountRate;
	}

	public double getDiscountRate() 
	{
		return discountRate;
	}

	public void setDiscountRate(double discountRate) 
	{
		this.discountRate = discountRate;
	}
	
	public String toString() 
	{
		return super.toString();
	}

	public double calcDisc(double finalPrice)
	{
		double tempRate = 0.0;
		//double price = 100;
		
		if (finalPrice <= 2000)
		{
			tempRate = 0.1;
		}
		else if (finalPrice > 2000 || finalPrice <= 10000)
		{
			tempRate = 0.125;
		}
		else if (finalPrice > 10000 || finalPrice <= 20000)
		{
			tempRate = 0.15;
		}
		else
		{
			tempRate = 0.175;
		}
		
		return discountRate = tempRate;	
	}
	
	/*public double finalPrice()
	{
		double finalCashPrice = super.finalPrice() * discountRate;
		
		return finalCashPrice;
		
	}*/
}

