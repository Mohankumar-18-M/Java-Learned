package Intermediate;

import java.util.Scanner;

public class Swper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a value:");
		int a = sc.nextInt();
		System.out.print("b value:");
		int b = sc.nextInt();
		System.out.println("Before Swap:");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Before Swap:");
		System.out.println("a ="+a);
		System.out.println("b ="+b);

	}

}
