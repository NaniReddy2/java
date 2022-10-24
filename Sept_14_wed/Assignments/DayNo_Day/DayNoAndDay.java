import java.util.Scanner;
class  DayNoAndDay
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a day number ");
		int day=scan.nextInt();
		switch(day)
		{
		  case 1:System.out.println(day+" is Monday");
		  break;
		  case 2:System.out.println(day+" is Tuesday");
		  break;
		  case 3:System.out.println(day+" is Wednessday");
		  break;
		  case 4:System.out.println(day+" is Thursday");
		  break;
		  case 5:System.out.println(day+" is Friday");
		  break;
		  case 6:System.out.println(day+" is Saturday");
		  break;
		  case 7:System.out.println(day+" is Sunday");
		  break;
		  default:System.out.println(" invalid day");
		}
	}
}
