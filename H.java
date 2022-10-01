// Prime Number or not.

import java.util.Scanner;
class H
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, count=0;
		
		System.out.println("Enter any no:");
		n=sc.nextInt();
		for(int i =1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.print("Prime Number");
		else
			System.out.println("Not Prime Number");
	}
}
		
		