import java.util.Scanner;
class D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int  a, b, c, ch;
		System.out.println("Choose operation:");
		ch=sc.next().charAt(0);
		System.out.println("Enter two no:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		sc.close();
		
		switch(ch)
		{
		case '+':
		c=a+b;
		System.out.println("ADDITION:"+c);
		break;
		
		case '-':
		c=a-b;
		System.out.println("SUBTRACTION:"+c);
		break;
		
		case '*':
		c=a*b;
		System.out.println("MULTIPLICATION:"+c);
		break;
		
		case '/':
		c=a/b;
		System.out.println("DIVISION:"+c);
		break;
		
		case '%':
		c=a%b;
		System.out.println("MODULOUS:"+c);
		break;
		
		default:
		System.out.println("invalid operation");
		}
	}
}