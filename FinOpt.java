package assignmentQ2;

import general.*;

public class FinOpt extends Transaction
{
	public static double deposit;
	public static double baseRate;
	public int noOfYrs;
	
	public FinOpt() 
	{
		super();
		deposit = 0.00;
		baseRate = 0.00;
		noOfYrs = 0;
	}

	public FinOpt(int transNo, MyProduct product, int qty, int noOfYrs)
	{
		super(transNo, product, qty);
	
		this.deposit = deposit;
		this.baseRate = baseRate;
		this.noOfYrs = noOfYrs;
	}

	public double getDeposit() 
	{
		return deposit;
	}

	public void setDeposit(double deposit) 
	{
		this.deposit = deposit;
	}

	public double getBaseRate() 
	{
		return baseRate;
	}

	public void setBaseRate(double baseRate) 
	{
		this.baseRate = baseRate;
	}

	public int getNoOfYrs() 
	{
		return noOfYrs;
	}

	public void setNoOfYrs(int noOfYrs) 
	{
		this.noOfYrs = noOfYrs;
	}

	@Override
	public String toString() 
	{
		return super.toString() + "\t\t" + deposit + "\t\t" + baseRate + "\t\t" + noOfYrs;// + "\t\t" + getProduct();
	}
	
	public double calcInterestRate()
	{
		double tempIntRate = 0.0;
		
		if (noOfYrs == 1)
		{
			tempIntRate = 0.29;
		}
		else if (noOfYrs > 1 && noOfYrs <= 4)
		{
			tempIntRate = 0.39;
		}
		else
		{
			tempIntRate = 0.49;
		}
		
		return baseRate = tempIntRate;
	}
	
	public double calcInterest(double price, double baseRate)
	{
		double interest;
		
		interest = price * baseRate;
		
		return interest;
		
	}

	public double finalFinPrice()
	{
		//double finalPrice = Transaction.finalPrice(MyProduct.getPrice()) + (Transaction.finalPrice(MyProduct.getPrice()) * calcInterestRate());
		
		return finalPrice;
	}
	
	public double getMonthlyPayment()
	{
		double monthlyPayment = finalPrice / noOfYrs;
		
		return monthlyPayment;
		
	}
}
