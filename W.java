//Print the Sum of First n Natural Numbers.

import java.util.Scanner;
class W{
	public static void main(String args[]){
		
		int sum = 0, n;
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter no  to be print");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Print the Sum of First Natural no is : "+sum);
	}
}