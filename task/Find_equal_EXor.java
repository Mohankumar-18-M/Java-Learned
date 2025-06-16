package task;

import java.util.Scanner;

public class Find_equal_EXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A value : ");
		int A = in.nextInt();
		System.out.print("Enter B value : ");
		int B = in.nextInt();
		//boolean a = (A^B)?true:false ;
		System.out.println(((A^B)>0)?"Not equal":"Equal");

	}

}
