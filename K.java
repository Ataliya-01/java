import java.util.Scanner;
class K
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter a no A:");
		a=sc.nextInt();
		System.out.println();
		b=sc.nextInt();
		if(a==b)
		{
			System.out.println("equal");
		}
		else if(a>b){
			System.out.println("a is greater");
		}
		else{
			System.out.println("a is not greater");
		}
	}
}
