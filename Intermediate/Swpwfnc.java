package Intermediate;

import java.util.Scanner;

public class Swpwfnc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		System.out.println("Before Swap:");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		swp(a,b);


	}
	public static void swp(int a,int b) {
		System.out.println("After swap:");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
