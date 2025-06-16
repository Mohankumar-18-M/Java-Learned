package task;

import java.util.Scanner;

public class Biggest_digit_in_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int N = in.nextInt();
		int temp = N;int big=0;
		while(temp != 0) {
			int last_digit = temp%10;
			temp /= 10;
			if(big < last_digit) {
				big = last_digit;
			}
		}
		System.out.println("The biggest digit in "+N+" is "+big);

	}

}
