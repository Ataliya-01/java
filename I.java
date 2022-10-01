//Even and Odd Program

import java.util.Scanner;
class I
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a no:");
		n = sc.nextInt();
		
		if(n % 2 == 0)
		{
			System.out.println("Even");
		}
			else
			{
			System.out.println("Odd");
			}
	}
}
		
		