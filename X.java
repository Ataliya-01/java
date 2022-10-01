//Print the table of a Number input bt the user.

import java.util.Scanner;
class X{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<11; i++)
		{
			System.out.println(n*i);
		}
	}
}