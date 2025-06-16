package task;

import java.util.Scanner;

public class Prime_with_recursion {
	
	static void prime(int m,int n) {
		int a = m;int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(a);
		}
		if(a<n) {
			prime(++a,n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int N = in.nextInt();
		prime(2,N);
		

	}

}
