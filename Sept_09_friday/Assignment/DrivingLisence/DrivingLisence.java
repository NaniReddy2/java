import java.util.Scanner;
class GivenNoIs5OrNot
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number ");
		int num=scan.nextInt();
		if (num==5)
		{
			System.out.println("It is a 5");
		}
		else
		{
			System.out.println("It is not a 5");
		}
	}
}
