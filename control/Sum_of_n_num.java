package control;

import java.util.Scanner;

public class Sum_of_n_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum = sum+i;
		}
		System.out.println("The sum of num upto "+a+" is: "+sum);

	}

}
