import java.util.Scanner;
class Combination7
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		char gender=scan.next().charAt(0);
		switch(gender)
		{
		  case 'm':
		  case 'M':System.out.println("You are Male");		  
		  break;
		  case 'f':
		  case 'F':System.out.println("You are Female");
		  break;
		  default :System.out.println("Invalid charecter");
		}

	}
}
