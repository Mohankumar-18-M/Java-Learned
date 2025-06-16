package task;

import java.util.Scanner;

public class New_Year_discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Bill amount : ");
		int Bill = in.nextInt();
		int temp = Bill;int discount =0;
		while(temp!=0) {
			int digit = temp % 10;
			if(digit % 2 != 0) {
				discount = discount+digit;
			}
			temp /=10;
		}
		if(discount == 0) {
			System.out.println("No discount.");
		}
		else {
			System.out.println("Discount : "+discount);
		}
		
		

	}

}
