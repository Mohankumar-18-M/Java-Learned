package control;

import java.util.Scanner;

public class Table_of_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = sc.nextInt();
		for(int i=1;i<=(a*10);i++) {
			System.out.print(i+" * "+a+" = ");
			System.out.println(i*a);
		}

	}

}
