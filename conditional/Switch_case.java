package conditional;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		char a = sc.next().charAt(1);
		System.out.println(a);
		switch(a) {
		case 'A':{
			System.out.println("Case a");
			break;
		}
		case 'b':{
			System.out.println("Case b");
			break;
		}
		case '6':{
			System.out.println("Case c");
			break;
		}
		default:{
			System.out.println("Default case");
		}
		case 4:{
			System.out.println("case 4");
		}
		}

	}

}
