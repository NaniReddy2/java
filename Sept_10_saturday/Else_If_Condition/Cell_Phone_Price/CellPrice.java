import java.util.Scanner;
class CellPrice 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Price");
		int price=scan.nextInt();
		if (price>=0 && price<=10000)
		{
          System.out.println("MI(RedMi) Mobiles-Are there");
		}
		else if(price>=11000 && price<=20000)
		{
			 System.out.println("Realme Mobiles-Are there");
		}
		else if(price>=21000 && price<=30000)
		{
		      System.out.println("Samsung Mobiles-Are there");
		}
		else if(price>=31000 && price<=40000)
		{
		      System.out.println("OnePlus Mobiles-Are there");
		}
		else if(price>=41000 && price<=150000) 
		{
		      System.out.println("Iphone(Apple) Mobiles-Are there");
		}
		else  
		{
		      System.out.println("");
		}
	}
}
