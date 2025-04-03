package control;

import java.util.Scanner;

public class Factors_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = sc.nextInt();
		System.out.println("Factors:");
		for(int i=1;i<=a;i++) {
			if(a%i == 0) {
				System.out.print(i+" ");
			}
		}

	}

}
