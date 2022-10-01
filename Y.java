//Print all even numbers

import java.util.Scanner;
class Y{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a no to be print:");
		int n = sc.nextInt();
		
		//for(int i= 0; i<=n;i=i+2)
		//{           
			
			//System.out.print(i+" ");
		//}
		
		
													//or


		//int n= 25;
			//for(int i=1; i<=n; i++)
			//{
				//if(i%2==0){
					//System.out.print(i+" ");
				//}
			//}
		
													//or
													
			for(int i=1; i<=n; i++)
			{
				if(i%2==0){
					System.out.print(i+" ");
				}				
			}				
							
	}
}