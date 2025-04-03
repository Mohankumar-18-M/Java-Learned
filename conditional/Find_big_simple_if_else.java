package conditional;

import java.util.Scanner;

public class Find_big_simple_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.println(((a % 2)== 0)?"even":"odd");
		String b;
		if (a % 2 == 0)
			b = "even";
		else
			b = "odd";
		System.out.println(b);
		

	}

}
