package control;

import java.util.Scanner;

public class Factorial_using_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = sc.nextInt();
		int fact = 1,temp=1;
		while(temp<=a) {
			fact = fact*temp;
			temp++;
		}
		System.out.println("The factorial of "+a+" is: "+fact);

	}

}
