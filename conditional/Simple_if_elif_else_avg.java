package conditional;

import java.util.Scanner;

public class Simple_if_elif_else_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter mark1:");
		int m1 = sc.nextInt();
		System.out.print("Enter mark2:");
		int m2 = sc.nextInt();
		System.out.print("Enter mark3:");
		int m3 = sc.nextInt();
		System.out.print("Enter mark4:");
		int m4 = sc.nextInt();
		System.out.print("Enter mark5:");
		int m5 = sc.nextInt();
		int avg = (m1+m2+m3+m4+m5)/5;
		System.out.println(avg);
		if(avg<=100 && avg>90) {
			System.out.println("Grade : O");
		}
		else if(avg<=90 && avg>80) {
			System.out.println("Grade : A");
		}
		else if(avg<=80 && avg>70) {
			System.out.println("Grade : B");
		}
		else if(avg<=70 && avg>60) {
			System.out.println("Grade : C");
		}
		else if(avg<=60 && avg>50) {
			System.out.println("Grade : D");
		}
		else if(avg<=50 && avg>0) {
			System.out.println("Grade : Fail");
		}
		else {
			System.out.println("Invalid Mark");
		}

	}

}
