package task;

import java.util.Scanner;

public class Left_right_swift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int power_32=1;int power_n=1;
		System.out.print("Enter N value : ");
		int N = in.nextInt();
		System.out.println(N>>2);  //right shift (N*2 POWER 2)
		System.out.println(N<<2);  //left shift (N/2 POWER 2)
		System.out.println(N>>>2);  //unsigned right shift (-N + 2 POWER 32 /2 POWER 2(s))
		for(int i=0;i<32;i++) {
			power_32 = power_32 * 2;
		}
		System.out.println(power_32);
		for(int i=0;i<-N;i++) {
			power_n = power_n * 2;
		}
		System.out.println(power_n);
		System.out.println(power_32 / power_n -N);
		
		

	}

}
