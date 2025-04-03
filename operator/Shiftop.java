package operator;

import java.util.Scanner;

public class Shiftop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A value:");
		int a = sc.nextInt();
		System.out.println("a<<2 = "+(a<<2));
		System.out.println("a>>2 = "+(a>>2));

	}

}
