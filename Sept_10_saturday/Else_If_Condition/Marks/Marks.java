import java.util.Scanner;
class Marks 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=scan.nextInt();
		if (marks>=90 && marks<=100)
		{
          System.out.println("1st-class");
		}
		else if(marks>=80 && marks<=89)
		{
			 System.out.println("2nd-class");
		}
		else if(marks>=65 && marks<=79)
		{
		      System.out.println("3rd-class");
		}
		else if(marks>=35 && marks<=64)
		{
		      System.out.println("Avrg");
		}
		else if(marks>=100) 
		{
		      System.out.println("Invalid Enter correct Marks");
		}
		else  
		{
		      System.out.println("Fail");
		}
	}
}
