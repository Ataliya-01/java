//Print the Half Pyramid Pattern

import java.util.Scanner;
class Pattern2{
	public static void main(String args[]){
		int n=4;
		//inner loop
		for(int i=1;i<=n;i++)
		{
			//outer loop
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}