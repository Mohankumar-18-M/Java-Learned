package conditional;

import java.util.Scanner;

public class Find_big_ternary_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = ob.nextInt();
		System.out.print("Enter b num: ");
		int b = ob.nextInt();
		System.out.print("Enter c num: ");
		int c = ob.nextInt();
		System.out.println((a>b && a>c)?a+" is big bang":(b>c)?b+" is big":c+" is big");


	}

}
