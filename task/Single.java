package task;

import java.util.Scanner;


public class Single{
	static int sum(int n)
	{
	
		int sum1=0;
		while(n>=10)
		{
			sum1= 0;
			
		while(n!=0)
		{
			sum1=sum1+(n%10);
			n/=10;
		}
		n=sum1;
		}
		return sum1;}
		
	
	
	public static void main(String a[]) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter N value : ");
	int N = in.nextInt();     // 1378  = 19  = 10  = 1
	int temp = sum(N);
	System.out.println(temp);

	in.close();
	}
	
}

