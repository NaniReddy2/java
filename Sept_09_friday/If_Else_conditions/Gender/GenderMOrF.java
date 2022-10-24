import java.util.Scanner;
class GenderMOrF  
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your gender");
		char gen=scan.next().charAt(0);
		if (gen=='M' || gen=='m')
		{
			System.out.println("Your are a Male");
		}
		else
		{
			System.out.println("Your are a Female");
		}
	}
}
