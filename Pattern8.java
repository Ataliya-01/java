//Print the 0-1 Triangle Pattern
import java.util.*;
class Pattern8{
	public static void main(String args[]){
		int n=5;
		
		//outer loop
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				int sum = i+j;
				if(sum % 2 == 0){
					System.out.print("1 ");
				}else { //odd
				System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}