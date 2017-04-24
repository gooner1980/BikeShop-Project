package general;

public class MyProduct 
{
	public int prodNo;
	public String make, model;
	public double price;
	
	public MyProduct() 
	{
		super();
		prodNo = 0; 
		make = ""; 
		model = "";
		price = 0.00;
	}

	public MyProduct(int prodNo, String make, String model, double price) 
	{
		super();
		this.prodNo = prodNo;
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public int getProdNo() 
	{
		return prodNo;
	}

	public void setProdNo(int prodNo)
	{
		this.prodNo = prodNo;
	}

	public String getMake() 
	{
		return make;
	}

	public void setMake(String make) 
	{
		this.make = make;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return  prodNo + "\t\t" + make + "\t\t" + model + "\t\t\t£" + price;
	}
}
