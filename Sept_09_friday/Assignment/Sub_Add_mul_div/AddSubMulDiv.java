import java.util.Scanner;
class AddSubMulDiv
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number ");
		int num1=scan.nextInt();
		System.out.println("Enter any Number ");
		int num2=scan.nextInt();
		int num3=(num1+num2);
		int num4=(num1-num2);

		int num5=(num1*num2);
		int num6=(num1/num2);
		int num7=(num1%num2);
		
			System.out.println("The Addition is "+num1+" and "+num2+" is "+num3 );
			System.out.println("The Subtraction is "+num1+" and "+num2+" is "+num4 );
			System.out.println("The multlipication is "+num1+" and "+num2+" is "+num5 );
			System.out.println("The Division is "+num1+" and "+num2+" is "+num6);
			System.out.println("The Division is "+num1+" and "+num2+" is "+num7);
				
	}
}
