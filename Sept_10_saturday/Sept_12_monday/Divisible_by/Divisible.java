import java.util.Scanner;
class Divisible 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		if (num%3==0)
		{
			System.out.println("It is divisible by 3");
		}
		else if(num%4==0)
		{
			System.out.println("It is divisible by 4");
		}
		else if(num%5==0)
		{
			System.out.println("It is divisible by 5");
		}
		else 
		{
		   System.out.println("It is not divisible by above 3,4,5 numbers");
		}
	}

}
