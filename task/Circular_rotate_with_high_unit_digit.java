package task;

import java.util.Scanner;

public class Circular_rotate_with_high_unit_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int N = in.nextInt();
		int temp = N;int big=0;int count=0;
		while(temp != 0) {
			int last_digit = temp%10;
			temp /= 10;
			if(big < last_digit) {
				big = last_digit;
			}
			count++;
		}
		temp = N;
		while(temp != 0) {
			int last_digit = temp%10;
			temp /= 10;
			for(int i=0;i<count-1;i++) {
				last_digit = last_digit*10;
			}
			temp = last_digit+temp;
			if(temp%10 == big) {
				break;
			}
		}
		System.out.println(temp);

	}

}
