package array_Basic;

import java.util.Scanner;

public class Array_even_odd_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Even element in the array: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd element in the array: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 1) {
				System.out.println(a[i]);
			}
		}

	}

}
