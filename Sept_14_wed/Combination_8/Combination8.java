import java.util.Scanner;
class Combination8
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String colour=scan.next();
		switch(colour)
		{
		  case "Yellow":
		  case "yellow":System.out.println("Lemon is yellow");		  
		  break;
		  case "Red":
		  case "red":System.out.println("Blood is red");
		  break;
		  case "White":
		  case "white":System.out.println("Milk is white");
		  break;
		  default :System.out.println("Invalid colour");
		}

	}
}
