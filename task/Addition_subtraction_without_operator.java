package task;

import java.util.Scanner;

public class Addition_subtraction_without_operator {
	
	static int add(int a,int b) {
		for(int i=0;i<b;i++) {
			a++;
		}
		return a;
	}
	
	static int sub(int a,int b) {
		
		for(int i=0;i<b;i++) {
			a--;
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A value : ");
		int A = in.nextInt();
		System.out.print("Enter B value : ");
		int B = in.nextInt();
		System.out.println("Addition of this numbers : "+add(A,B));
		System.out.println("subtraction of this numbers : "+sub(A,B));
		
		

	}

}
