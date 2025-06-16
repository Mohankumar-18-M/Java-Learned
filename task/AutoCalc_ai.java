package task;

import java.util.Scanner;

public class AutoCalc_ai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number of days : ");
		int N = in.nextInt();
		if(N>0) {
			if(N==0) {
				System.out.println("Total rental cost : 0");
			}
			if(N>=1 && N<=3) {
				System.out.println("Total rental cost : "+ (N*500));
			}
			else if(N>=4 && N<=7) {
				System.out.println("Total rental cost : "+ ((3*500)+((N-3)*400)));
			}
			else if(N>=8) {
				System.out.println("Total rental cost : "+((3*500)+(4*400)+((N-7)*300)));
			}
		}
		else {
			System.out.println("Invalid days");
		}
		

	}

}
