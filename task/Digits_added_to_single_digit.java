package task;

import java.util.Scanner;

public class Digits_added_to_single_digit {
	
	static int return_sum(int n) {
		int temp = n;
		int sum=0;
		while(temp != 0) {
			int digit = temp%10;
			sum = sum+digit;
			temp /=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int N = in.nextInt();     // 1378  = 19  = 10  = 1
		int temp = return_sum(N);
		while(temp/10 != 0) {
			temp = return_sum(temp);
		}
		System.out.println(temp);

	}

}
