import java.util.Scanner;
class BiggestNo 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");	
		int num1=scan.nextInt();
		System.out.println("Enter number");
		int num2=scan.nextInt();
		if (num1>num2)
		{
		  System.out.println("This is biggest number");
		}
        else
		{
		 System.out.println("it is a Small number");
		 }
	}
}
