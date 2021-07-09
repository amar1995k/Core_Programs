package basicCorePrograms;

import java.util.Scanner;

public class FlipCoin
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number times to flip ");
		int n= sc1.nextInt();
		int Percentage_Head = 0;
		int Percentage_Tail =0;
		int head=0, tail =0;
		int m=n;
		
		for (int i = 0; i < n; i++)
		{
			double x = Math.random();
			if (x < 0.5) 
			{
				tail=tail+1;
				
			} 
			else
			{
				head=head+1;
				
			}
			
		}
		System.out.println(" tail = "+tail);
		Percentage_Tail=tail*100/n;
		System.out.println("Percentage of tail is "+Percentage_Tail +" %");
		
		System.out.println("head = "+head);
		Percentage_Head= head*100/n;
		System.out.println("Percentage of head is "+ Percentage_Head+" % " );
		
		sc1.close();
	}
}

