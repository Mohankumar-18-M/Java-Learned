package task;

import java.util.Scanner;

public class Circular_rotate_till_small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int N = in.nextInt();
		int temp = N;int big=0;int count=0;int n_count=0;int C_small=0;
		while(temp != 0) {
			int last_digit = temp%10;
			temp /= 10;
			/*if(big < last_digit) {
				big = last_digit;
			}*/
			count++;
		}
		temp = N;
		C_small = N;
		while(n_count < count) {
			int last_digit = temp%10;
			temp /= 10;
			for(int i=0;i<count-1;i++) {
				last_digit = last_digit*10;
			}
			temp = last_digit+temp;
			//System.out.println(temp);
			if(C_small>temp) {
				C_small = temp;
			}
			n_count++;
		}
		System.out.println("The smallest digit in rotation : "+C_small);
		

	}

}
