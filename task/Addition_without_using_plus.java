package task;

import java.util.Scanner;

public class Addition_without_using_plus {
	static int add(int a,int b) {
		//int carry = a&b;
		while( b!=0) {
			int carry = a&b;
			a = a^b;
			b =  carry<<1;
			
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A value : ");
		int A = in.nextInt();
		System.out.print("Enter A value : ");
		int B = in.nextInt();
		int res = add(A,B);
		System.out.println("Addition : "+res);
	}

}
