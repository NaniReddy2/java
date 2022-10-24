import java.util.Scanner;
class  NumberIs01
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
		switch(num)
			{
		      case 0: System.out.println("Given number is "+num);
			  break;
			  case 1: System.out.println("Given number is "+num);
			  break;
			  default:System.out.println("Given numbet is not 0 or 1 that is "+num);
		    }

		
	}
}
