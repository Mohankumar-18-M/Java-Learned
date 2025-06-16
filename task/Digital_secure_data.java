package task;

import java.util.Scanner;

public class Digital_secure_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char encrypted;
		System.out.print("Enter char to encrypt : ");
		char word = in.next().charAt(0);
		System.out.print("Enter the digit to encrypt: ");
		int N = in.nextInt();
		int temp = word;
		//System.out.println(temp);
		temp = temp + N;
		if(temp>90) {
			int h = temp-90;
			temp = 64 + h;
		}
		encrypted = (char)temp;
		System.out.println("The encrypted : "+encrypted);
		

	}

}
