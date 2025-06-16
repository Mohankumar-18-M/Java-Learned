package task;

import java.util.Scanner;

public class Fibonacci_using_function {
	
	static void fibonacci(int a,int b,int n) {
		int temp=a+b;
		
		if(temp<=n) {
			System.out.print(temp+" ");
			fibonacci(b,temp,n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int N = in.nextInt(); 
		System.out.print("Fibonacci series : 0 0 ");
		fibonacci(0,1,N);
		

	}

}
