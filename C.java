import java.util.Scanner;
class C
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a , b, c, ch;
			System.out.println("Enter two No:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("Choose Operation :");
			ch=sc.nextInt();
			if(ch==1)
			{
				c=a+b;
				System.out.println("ADDITION:"+c);
			}
			else if(ch==2)
			{
				c=a-b;
				System.out.println("SUBSTRACTION:"+c);
			}
			else if(ch==3)
			{
				c=a*b;
				System.out.println("MULTIPLICATION:"+c);
			}
			else if(ch==4)
			{
				c=a/b;
				System.out.println("DIVISION:"+c);
			}
			else
			{
				c=a%b;
				System.out.println("MODULOUS:"+c);
			}
	}
}
			
			