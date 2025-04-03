package array_Basic;

import java.util.Scanner;

public class Char_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		char c[] = new char[n];
		System.out.println("Enter "+n+" character");
		for(int i=0;i<c.length;i++) {
			c[i] = sc.next().charAt(0);
		}
		System.out.println("The given charaters:");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		

	}

}
