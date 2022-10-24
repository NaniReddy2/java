import java.util.Scanner;
class ATMOperation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double balance=10000.56;
		int pass=1234;
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println(name+" Welcome enter your password");
		int password=sc.nextInt();
		if (pass==password)
		{
			System.out.println("Enter the amount to be withdrawn");
			int amount=sc.nextInt();
			if (amount<=balance)
			{
				System.out.println(amount+"successfully withdrawn");
				balance=balance-amount;
				System.out.println("avaliable balance is "+balance);
			}
			else 
			{
			  System.out.println("insufficient funds");
			}
		}
		else
		{
		 System.out.println("enter valid password");
		}
	}
}
