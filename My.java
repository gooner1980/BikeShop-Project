package general;

import java.util.*;

public class My 
{
	public static Scanner key = new Scanner(System.in);
	
	public static void p(String s)
	{
		System.out.printf(s);
	}
	
	public static char again(String s)
	{
		String input;
		char ch;
		
		do
		{
			p("\n\n\t" + s + " ");
			input = key.next();
			ch = input.toUpperCase().charAt(0);
			
			if (ch != 'Y' && ch != 'N')
			{
				p("\n\n\tERROR - Please enter Y or N");
			}
			
		}while(ch != 'Y' && ch != 'N');
		
		return ch;
	}
	
	public static void pressKey()
	{
		p("\n\n\tPress Return key to continue...");
		key.nextLine();
	}
	
	public static void skip(int n)
	{
		for (int i = 0; i < n; i++)
			System.out.println();
	}
	
	public static int getOption(int min, int max)
	{
//		int input;
//		boolean valid;
//	
//		do
//		{ 
//			valid = false;
//			input = key.nextInt();
//
//			if (input < min || input > max)
//			{			 
//				System.out.printf("\n\nInvalid input! Please re-enter a value between " + min + " and " + max + ":  ");	
//			}
//			else
//			{
//				valid = true;
//				System.out.printf("\n\nNumber entered " + input + " is between " + min + " & " + max);	
//			}
//
//		} while (!valid);
//		
//		return input;
		
		int opt = 0;
		
		while (opt < min || opt > max)
		{
			opt = key.nextInt();
			if (opt < min || opt > max)
			{
				p("\tInvalid input! Please re-enter a value between " + min + " and " + max + ":  ");
			}
		}
		
		return opt;
	}
	
	public static int menuBooking(String s)
	{
		int option = 0;
		
		p("\n\n" + s);
		p("\n----------------------------");
		p("\nMain Menu");
		p("\n----------------------------");
		p("\n1 - Add " + s);
		p("\n2 - Display all " + s);
		p("\n3 - Search " + s);
		p("\n4 - Display all NON ADULT " + s);
		p("\n5 - Display Trip Incomes");
		p("\n6 - Display details by pickup location");
		p("\n7 - Display destination breakdowns");
		p("\n8 - Exit");
		p("\nEnter Option (1 - 8): ");
		option = getOption(1, 8);
		
		return option;
	}
	
	public static int menuBookingSearch(String s)
	{
		int option = 0;
		
		p("\n\n" + s + " Menu");
		p("\n----------------------------");
		p("\n1 - " + s + " by Booking Number");
		p("\n2 - " + s + " by Travel Date");
		p("\n3 - " + s + " by Passenger Name");
		p("\n4 - Exit to Main Menu");
		p("\nEnter Option (1 - 4): ");
		option = getOption(1, 4);
		
		return option;
	}
	
	public static int displayJourneyMenu()
	{
		int option = 0;
		
		p("\n\nJourney Options");
		p("\n-------------------------------");
		p("\n1:  B1 - Derry -> Belfast"); 
		p("\n2:  B2 - Derry -> Belfast"); 
		p("\n3:  E3 - Derry -> Enniskillen");
		p("\n4:  D4 - Derry -> Dublin"); 
		p("\n5:  R1 - Belfast -> Derry"); 
		p("\n6:  R2 - Belfast -> Derry"); 
		p("\n7:  R3 - Enniskillen -> Derry");
		p("\n8:  R4 - Dublin -> Derry"); 
		//p("\n3:  Exit");
		p("\nEnter option (1 - 8):\t");
		option = getOption(1, 8);
		
		return option;
	}
	
	public static int displayB1B2PickUpMenu()
	{
		int option = 0;
		
		p("\n\nJourney Options");
		p("\n-------------------------------");
		p("\n1:  Derry"); 
		p("\n2:  Dungiven"); 
		p("\n3:  Castledawson");
		//p("\n3:  Exit");
		p("\nEnter option (1 - 3):\t");
		option = getOption(1, 3);
		
		return option;
	}
	
	public static int displayR1R2PickUpMenu()
	{
		int option = 0;
		
		p("\n\nJourney Options");
		p("\n-------------------------------");
		p("\n1:  Belfast"); 
		p("\n2:  Castledawson"); 
		p("\n3:  Dungiven");
		//p("\n3:  Exit");
		p("\nEnter option (1 - 3):\t");
		option = getOption(1, 3);
		
		return option;
	}
	
	public static void menu()
	{
		p("\n\nBig Bikes - Motorcycle Store");
		p("\n----------------------------");
		p("\nMain Menu");
		p("\n----------------------------");
		p("\n1:  Add Transaction"); 
		p("\n2:  Display Transactions");  
		p("\n3:  Display All Transactions"); 
		p("\n4:  Exit");
		p("\nEnter option (1 - 4):\t");
	}
	
	public static void displayCatMenu()
	{
		p("\n\nTransaction Menu");
		p("\n----------------------------");
		p("\n1:  Display Cash Transactions"); 
		p("\n2:  Display Finance Transactions"); 
		p("\n3:  Exit");
		p("\nEnter option (1 - 3):\t");
	}
	
	public static void productMenu()
	{
		p("\n\nChoose a product");
		p("\n----------------------------");
		p("\n1:  Yamaha MT-10 SP - £13400"); 
		p("\n2:  Yamaha YZF-R6 - £11000"); 
		p("\n3:  Yamaha X-MAX 400 - £5900");
		p("\n4:  Yamaha XVS1300 - £9300");
		p("\n5:  Yamaha YZ450F - £7100");
		p("\n6:  Suzuki GSX-R1000 - £16100");
		p("\n7:  Suzuki Burgman 125 - £3700");
		p("\n8:  Suzuki Address - £2000");
		p("\n9:  Suzuki Intruder - £12500");
		p("\n10: Suzuki RM-Z450 - £6600");
		//p("\n3:  Exit");
		p("\nEnter option (1 - 10):\t");
	}
	
	public static void displayPayMenu()
	{
		p("\n\nPayment Options");
		p("\n----------------------------");
		p("\n1:  Cash Transaction"); 
		p("\n2:  Finance Transaction"); 
		//p("\n3:  Exit");
		p("\nEnter option (1 - 2):\t");
	}
	
	public static void displayYrsMenu()
	{
		p("\n\nPayment Options");
		p("\n----------------------------");
		p("\n1:  1 year"); 
		p("\n2:  2 years"); 
		p("\n3:  3 years");
		p("\n4:  4 years"); 
		p("\n5:  5 years"); 
		//p("\n3:  Exit");
		p("\nEnter option (1 - 5):\t");
	}
	
	public static boolean stringsEqual(String s1, String s2)
	{
		boolean result;
		
		result = s1.equalsIgnoreCase(s2);
		
		return result;
	}
	
	public static void replaceWord(String s1, String s2, String s3)
	{
		boolean valid;
		
			if (valid = s1.contains(s2))
			{
				My.p("\n\n\t" + s1.replaceAll(s2, s3));
			}
			else
			{
				My.p("\n\n\tDoes Not Exist!!!");
			}			
	}
	
	public static void fullName(String forename, String surname)
	{
		String tempName = "";
		
		tempName = forename.concat(" ").concat(surname);
		
		My.p("\n\n\tYour name is: " + tempName);
		
	}
}
