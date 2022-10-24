import java.util.Scanner;
class PositiveNumberOrNegitiveNumber
{
	public static void main(String[] args) 
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scan.nextInt();
		if (num>0)
		{
			System.out.println("it is a positive number");
		}
		else
		{
			System.out.println("it is negitive number");
		}
	
		
	}
}
