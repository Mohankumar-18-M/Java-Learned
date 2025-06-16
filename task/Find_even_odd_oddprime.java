package task;

import java.util.Scanner;

public class Find_even_odd_oddprime /*extends Find_equal_EXor*/ {
	
	static int Find_digit(int n){
		int temp = n;int digit;
		digit = temp%10;
		return digit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int N = in.nextInt();
		int temp = N;int digit;
		System.out.println("The even digits are:");
		while(temp != 0) {
			digit = Find_digit(temp);
			if(digit%2 == 0) {
				System.out.println(digit);
			}
			temp /= 10;
		}
		 temp = N;
		System.out.println("The odd digits are:");
		while(temp != 0) {
			digit = Find_digit(temp);
			if(digit%2 != 0) {
				System.out.println(digit);
			}
			temp /= 10;
		}
		temp = N;
		System.out.println("The prime digits are:");
		while(temp != 0) {
			int count =0;
			digit = Find_digit(temp);
			if(digit == 2) {
				System.out.println(digit);
			}
			for(int i=2;i<=digit/2;i++) {
				if(digit%i == 0) {
					count++;
				}

			}
			if(count == 0) {
				System.out.println(digit);
			}
						temp /= 10;
		}

	}

}
