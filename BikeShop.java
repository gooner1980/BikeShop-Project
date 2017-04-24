package assignmentQ2;

import java.util.Scanner;
import general.*;

public class BikeShop 
{
	public static Scanner key = new Scanner(System.in);
	public static MyProduct [] product = new MyProduct [10];
	public static Transaction [] trans = new Transaction [50];
	public static String cash = "Cash Transactions \n-----------------\n", finance = "Finance Transactions \n--------------------\n";

	public static void main(String[] args) 
	{	
		
		product[0] = new MyProduct(1,"Yamaha", "MT-10 SP", 13400.00);
		product[1] = new MyProduct(2,"Yamaha", "YZF-R6", 11000.00);
		product[2] = new MyProduct(3, "Yamaha", "X-MAX 400", 5900.00);
		product[3] = new MyProduct(4,"Yamaha", "XVS1300", 9300.00);
		product[4] = new MyProduct(5, "Suzuki", "GSX-R1000", 16100.00);
		product[5] = new MyProduct(6,"Suzuki", "Burgman 125", 3700.00);
		product[6] = new MyProduct(7,"Suzuki", "Address", 2000.00);
		product[7] = new MyProduct(8,"Suzuki", "Intruder", 12500.00);
		product[8] = new MyProduct(9, "Yamaha", "YZ450F", 7100.00);
		product[9] = new MyProduct(10,"Suzuki", "RM-Z450", 6600.00);
		
	
		trans[0] = new FinOpt(1001, product[0], 2, 4);
		trans[1] = new Cash(1002, product[1], 1);
		trans[2] = new Cash(1003, product[2], 2);
		trans[3] = new FinOpt(1004, product[3], 2, 2);
		trans[4] = new FinOpt(1005, product[4], 2, 5);
		trans[5] = new Cash(1006, product[5], 1);
		trans[6] = new FinOpt(1007, product[6], 2, 5);
		trans[7] = new FinOpt(1008, product[7], 2, 1);
		trans[8] = new Cash(1009, product[8], 1);
		trans[9] = new Cash(1010, product[9], 1);
		
		int option=0;
	
		do
		{
			cash = "Cash Transactions\n-------------\n";
			finance = "Finance Transactions\n-------------\n";
			My.menu();
			option = My.getOption(1, 6);
			switch(option)
			{
				case 1:
					addTrans();
				break;
				case 2:
					displayTrans(trans);
				break;
				case 3:
					displayAll(trans); 
				break;
				case 4:
					My.p("Goodbye");
				break;
			}
		}while(option != 4);
	}
	
	private static void addTrans()
	{
		boolean answer = false;
		
		do
		{
			My.p("\n\n\tAdd a transaction");
			
			String keyedAnswer = "";
			int tempTransNo = 0, tempYrs = 0;
			int pos = 0;
			boolean prodAnswer = false;
			
		
			if(pos < trans.length && trans[pos] != null)
			{
				while(trans[pos] != null)
				pos++;
				tempTransNo = trans[pos-1].getTransNo() + 1;
				My.p("\n\tTransaction No = " + tempTransNo);
				trans[pos] = new Transaction();
				trans[pos].setTransNo(tempTransNo);
				My.displayPayMenu();
				int option = My.getOption(1, 2); 
				switch(option)
				{
					case 1:
					{
						trans[pos] = new Cash();
					}
					break;
					case 2:
					{
						trans[pos] = new FinOpt();
						My.displayYrsMenu();
						option = My.getOption(1, 5); 
						switch(option)
						{
							case 1:
							{
								tempYrs = 1;
								((FinOpt) trans[pos]).setNoOfYrs(tempYrs);
								//trans[pos].setNoOfYrs(tempYrs);
								//trans[pos].FinOpt.setNoOfYrs(tempYrs);
								//FinOpt.setNoOfYrs(tempYrs);
							}
							break;
							case 2:
							{
								tempYrs = 2;
								//trans[pos].setNoOfYrs(tempYrs);
								((FinOpt) trans[pos]).setNoOfYrs(tempYrs);
							}
							break;
							case 3:
							{
								tempYrs = 3;
								//trans[pos].setNoOfYrs(tempYrs);
								((FinOpt) trans[pos]).setNoOfYrs(tempYrs);
							}
							break;
							case 4:
							{
								tempYrs = 4;
								//trans[pos].setNoOfYrs(tempYrs);
								((FinOpt) trans[pos]).setNoOfYrs(tempYrs);
							}
							break;
							case 5:
							{
								tempYrs = 5;
								//trans[pos].setNoOfYrs(tempYrs);
								((FinOpt) trans[pos]).setNoOfYrs(tempYrs);
							}
							break;
						}
					}
					break;
				}
				My.productMenu();
				option = My.getOption(1, 10);
				switch(option)
				{
					case 1:
					{
						trans[pos].setProduct(product[0]);
						prodAnswer = true;
					};
					break;
					case 2:
					{
						trans[pos].setProduct(product[1]);
						prodAnswer = true;
					};
					break;
					case 3:
					{
						trans[pos].setProduct(product[2]);
						prodAnswer = true;
					};
					break;
					case 4:
					{
						trans[pos].setProduct(product[3]);
						prodAnswer = true;
					};
					break;
					case 5:
					{
						trans[pos].setProduct(product[4]);
						prodAnswer = true;
					};
					break;
					case 6:
					{
						trans[pos].setProduct(product[5]);
						prodAnswer = true;
					};
					break;
					case 7:
					{
						trans[pos].setProduct(product[6]);
						prodAnswer = true;
					};
					break;
					case 8:
					{
						trans[pos].setProduct(product[7]);
						prodAnswer = true;
					};
					break;
					case 9:
					{
						trans[pos].setProduct(product[8]);
						prodAnswer = true;
					};
					break;
					case 10:
					{
						trans[pos].setProduct(product[9]);
						prodAnswer = true;
					};
					break;	
				}//end switch
				My.p("\nEnter the quantity purchased: ");
				trans[pos].setQty(key.nextInt());
				key.nextLine();
				My.p("\n\t\tWould you like to add another booking (Y / N): ");
				keyedAnswer = key.nextLine();
		
				if (keyedAnswer.equalsIgnoreCase("n"))
				{
					answer = false;
					//break;
				}
				else
				{
					answer = true;
					
				}
			}//end if
		}while(answer!= false);
	}
	
	private static void displayAll(Transaction [] trans)
	{
		//while(trans != null)
		for(int i = 0; i <trans.length; i++)
		{
			if(trans[i] instanceof Cash)
			{
				cash += trans[i].toString();
			}
			else if(trans[i] instanceof FinOpt)
			{
				finance += trans[i].toString();
			}
		}
		
		My.p("\n\n" + cash + "\n\n" + finance + "\n");
	}
	
	private static void displayTrans(Transaction [] trans)
	{
		int option = 0;
		
		do
		{
			My.displayCatMenu();
			option = My.getOption(1, 3);
			int catCount = 0;
			double value = 0.00;
			switch(option)
			{
				case 1:
					My.p("\n\n" + cash);
					for(int i = 0; i < trans.length; i++)
					{	
						if(trans[i] instanceof Cash)
						{
							//cash += trans[i].toString();
							My.p(trans[i].toString());
							value += trans[i].finalPrice();
							catCount++;
						}
					}
					My.p("\n\nTotal number of transactions in category: " + catCount + "\nTotal value = £" + value);
				break;
				case 2:
					My.p("\n\n" + finance);
					for(int i = 0; i<trans.length; i++)
					{						
						if(trans[i] instanceof FinOpt)
						{
							//finance += trans[i].toString();
							My.p(trans[i].toString());
							value += trans[i].finalPrice();
							catCount++;
						}	
					}
					My.p("\n\nTotal number of transactions in category: " + catCount + "\nTotal value = £" + value);
				break;	
				case 3:
				break;
			}
		}while(option < 3);
	}
}

