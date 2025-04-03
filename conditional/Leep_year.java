package conditional;

import java.util.Scanner;

public class Leep_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year:");
		int a = sc.nextInt();
		if((a % 4 == 0)&&((a % 400 ==0) || (a % 100 != 0))) {
			System.out.println(a+" is Leap year");
		}
		else {
			System.out.println(a+" is Not leap year");
		}

	}

}
