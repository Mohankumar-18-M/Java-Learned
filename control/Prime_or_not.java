package control;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		System.out.print("Enter a num: ");
		int a =sc.nextInt();
		for(int i=2;i<=a/2;i++) {
			if(a%i ==0) {
				b = false;
				break;
			}
			
		}
		if(b) {
			System.out.println(a+" is Prime");
		}
		else {
			System.out.println(a+" is not a prime");
		}

	}

}
