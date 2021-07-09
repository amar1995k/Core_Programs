package basicCorePrograms;

import java.util.Scanner;

public class HarmonicValue 
{
	public static void main(String[] args)
	{
		//input
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a number for Nth value = ");
		double n = ip.nextInt();
		
		//variable
		double h=0 ;
		System.out.println("Harmonic value for "+n+" is");
		//calculation
		while(n>0)
		{
			h=h+1/n;
			n--;
			System.out.println(h);
		}
		ip.close();//To avoid memory leaks.
	}
}

