import java.util.Scanner;
class  CheckGivenNumber
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int num1=scan.nextInt();
		System.out.println("Enter number");
		int num2=scan.nextInt();
		System.out.println("Give number");
		int num=scan.nextInt();
		switch(num)
		{
			case 1:System.out.println(num1+num2);
			break;
			case 2:System.out.println(num1-num2);
			break;
			case 3:System.out.println(num1*num2);
			break;
			case 4:System.out.println(num1/num2);
			break;
			case 5:System.out.println(num1%num2);
			break;
			default:System.out.println("invalid number");
			
		
		
		}
	}
}
