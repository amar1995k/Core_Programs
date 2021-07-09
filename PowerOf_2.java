package basicCorePrograms;

import java.util.Scanner;

public class PowerOf_2 
{
	public static void main(String[] args)
	{
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a number for power = ");
		int n = ip.nextInt();
		int s=0;
		for (int i = 0; i <= n; i++)
		{
			if (i==0) 
			{
				s=1;
				System.out.println("2 to the power 0 = "+s);
				
			} 
			else 
			{
				s=s*2;
				System.out.println("2 to the power "+i+"= "+s);
			}
			
		}
		
		ip.close();//To avoid memory leaks.
	}

}
