import java.util.Scanner;
class Atm 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter your name ");
		String name = scan.next();
		double balance = 100000.58;
		int pass = 1234;
		System.out.println("ENTER YOUR PASSWORD "+name);
		int password = scan.nextInt();
		if (pass == password)
		{
			System.out.println(" enter your widthrawnamount ");
			int amount = scan.nextInt();
			if (amount<=balance)
			{
				System.out.println(" successfull "+amount);
				balance  = balance-amount;
				System.out.println("your available amount is "+balance);
			}
			else
			{
				System.out.println(" insufficent funds ");
			}
		}
		else 
		{
	       System.out.println(" enter your valid password ");	
		}

		
	}
}
