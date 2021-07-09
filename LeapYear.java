package basicCorePrograms;
//To check whether the year is leap or not.
import java.util.Scanner;


class Check
{
	//variable
	int year  ;
	
	//method
	int LeapCheck()
	{
		//calculation
		if (year % 400 == 0)
		{
			System.out.println("The given is LEAP YEAR .");
		} 
		else if(year%4 == 0 && year%100 != 0)
		{
			System.out.println("The given is LEAP YEAR .");
		}
		else 
		{
			System.out.println(" The given is NOT LEAP YEAR .");
		}
		return(year);
	}
}

public class LeapYear
{
	public static void main(String[] args) 
	{
		//variable
		int n,count=0 ;
		
		//input
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a year = ");
		n = ip.nextInt();
		while (n>0) 
		{
			count=count+1;
			n=n/10;
		}
		System.out.println("The number of digits of given year is " +count );
		
		if (count==4)
		{
			//Creating Object
			Check ch1=new Check();
			
			//calling method
			ch1.LeapCheck();
			
			ip.close();//necessary to avoid memory leaks
			
		}
		else
		{
			System.out.println("The condition for number of digits is NOT SATISFIED.");

		}
	}
}
