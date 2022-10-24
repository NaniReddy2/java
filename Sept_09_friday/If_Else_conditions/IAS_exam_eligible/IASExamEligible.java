import java.util.Scanner;
class IASExamEligible 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age ");
		int ias=scan.nextInt();
		if (ias>=24 && ias<=34)
		{
			System.out.println("Your are eligible for IAS exam");
		}
		else
		{
			System.out.println("Your are noteligible for IAS exam");
		}
	}
}
