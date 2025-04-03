package control;

import java.util.Scanner;

public class Operation_on_a_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = sc.nextInt();
		int temp =a;
		int sum=0,fs=0,c=0,rev=0,d=0,ec=0,oc=0;
		while(temp!=0) {
			d = temp % 10;
			sum +=d;
			rev = (rev *10)+d;
			c++;
			if(d%2 ==0) {
				ec++;
			}
			else
				oc++;
			temp = temp/10;
		}
		fs = d;
		System.out.println("Sum of the digits = "+sum);
		System.out.println();
		System.out.println("Count of the digits = "+c);
		System.out.println();
		System.out.println("Reverse of the num = "+rev);
		System.out.println();
		System.out.println("First digit of num = "+fs);
		System.out.println();
		System.out.println("Last digit of num ="+a%10);
		System.out.println();
		System.out.println("Count of even digit in num = "+ec);
		System.out.println();
		System.out.println("Count of the odd digit in num = "+oc);
		System.out.println();
		if(rev == a) {
			System.out.println(a+" is palindrome");
		}
		else
			System.out.println(a+" is not a palindrome");

	}

}
