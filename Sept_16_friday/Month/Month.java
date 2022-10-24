import java.util.Scanner;
class Month
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter month");
		String month=scan.next();
		switch(month)
		{
		  case "march":
		  case "March":
		  case "Mar":
		  case "mar":
		  case "M":
		  case "m":
		  case "april":
		  case "apr":
		  case "April":
		  case "May":
		  case "may":System.out.println("It is a summer season");		  
		  break;
		  case "june":
		  case "June":
		  case "july":
	      case "July":
		  case "august":
		  case "aug":
		  case "Aug":
		  case "August":
		  case "September":
		  case "Sept":
		  case "sept":
	      case "september":System.out.println("It is a rainy season");
		  break;		  
		  case "october":
		  case "oct":
		  case "Oct":
		  case "October":
		  case "november":
		  case "nov":
		  case "Nov":
		  case "November":
		  case "December":
		  case "Dec":
		  case "dec":
		  case "december":System.out.println("It is a winter season");
		  break;
		  case "january":
		  case "jan":
		  case "Jan":
		  case "January":
		  case "Feburary":
		  case "Feb":
		  case "feb":
		  case "feburary":System.out.println("It is a spring season");
		  break;
		  
		  default :System.out.println("Invalid");
		}

	}
}
