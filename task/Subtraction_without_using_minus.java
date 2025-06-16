package task;

import java.util.Scanner;

public class Subtraction_without_using_minus {
	
	static int sub(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b;  //-3 & 1
            //System.out.println(borrow);
            a = a ^ b;    
            b = borrow << 1;
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
		int res = sub(A,B);
		System.out.println("Subtraction : "+res);
		

	}

}
