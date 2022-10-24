import java.util.Scanner;
class GivenInputNumber
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int num1=scan.nextInt();
		System.out.println("Enter Number");
		int num2=scan.nextInt();
		switch(brand)
		{
		  case "audi":
		  case "Audi":System.out.println("Starting 40L");		  
		  break;
		  case "Mercedes benz":
		  case "mercedes Benz":System.out.println("Starting 60L");
		  break;
		  case "jagaur":
		  case "Jaguar":System.out.println("Starting 40L");		  
		  break;
		  case "RangeRover":
		  case "rangerover":System.out.println("Starting 60L");
          break;
		  case "Ferari":
		  case "ferari":System.out.println("Starting 60L");
		  break;
		  case "RollsRoyce":
		  case "rollsroyce":System.out.println("Starting 40L");		  
		  break;
		 	
		 		  
		  default :System.out.println("Invalid");
		}

	}
}
