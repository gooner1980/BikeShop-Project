package assignmentQ2;

import general.*;

public class Transaction
{
	private int transNo;
	public int qty;
	//public static int count = 0;
	private MyProduct product;
	public int finalPrice;

	public Transaction() 
	{
		//count++;
		transNo = 0;
		qty = 0;
		product = new MyProduct();
	}

	public Transaction(int transNo, MyProduct product, int qty) 
	{
		super();
		//count++;
		this.transNo = transNo;
		this.qty = qty;
		this.product = product;
	}
	
	public int getTransNo() 
	{
		return transNo;
	}

	public void setTransNo(int transNo) 
	{
		this.transNo = transNo;
	}

	public int getQty() 
	{
		return qty;
	}

	public void setQty(int qty) 
	{
		this.qty = qty;
	}

	public MyProduct getProduct() 
	{
		return product;
	}

	public void setProduct(MyProduct product) 
	{
		this.product = product;
	}
	
	@Override
	public String toString() 
	{
		return "\n" + transNo + "\t" + product + "\t\t" + qty;
	}

	public double finalPrice()
	{
		double finalPrice = qty * getProduct().price;
		
		return finalPrice;
	}
}


