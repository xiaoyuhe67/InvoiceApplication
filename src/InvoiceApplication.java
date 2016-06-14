import java.util.Scanner;

public class InvoiceApplication {
	
	static Scanner keyboard=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double taxrate=0;
		double price=1;
		int pricenumber=0;
		System.out.print("Tax Rate ? : ");
		taxrate=keyboard.nextDouble();
		System.out.println("");
		
		double pricearr[]=new double[100];
		
		double subtotal=0;
		
		while(price>0)
		{
			pricenumber=pricenumber+1;
			System.out.print("Price # "+pricenumber+ " : ");
			price=keyboard.nextDouble();
			pricearr[pricenumber-1]=price;
			System.out.println("");
			
			if (price==0.0)
			{
				System.out.println("-----------------------");
				System.out.println("Receipt");
				for(int i=0;i<=pricenumber-2;i++)
				{
					subtotal=pricearr[i]+subtotal;
					System.out.println(String.format("%.02f", pricearr[i]));
				}
				
				System.out.println(subtotal+" subtotal");
				System.out.println((subtotal*taxrate)+" tax");
				System.out.println(String.format("%.02f", (subtotal*(1+taxrate)))+" grand total");
				break;
			}
		}
		
		
	}

}
