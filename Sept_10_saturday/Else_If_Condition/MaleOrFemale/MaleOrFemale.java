import java.util.Scanner;
class MaleOrFemale 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your gender");
		char gender=scan.next().charAt(0);
		if (gender=='m' || gender=='M')
		{
			System.out.println("your are Male");
		}
		else if (gender=='f' || gender=='F')
		{
            System.out.println("your are Female");
		}
		else 
		{
		    System.out.println("Enter valid charecter");
		}
	}
}
