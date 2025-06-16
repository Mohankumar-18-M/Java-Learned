package task;

import java.util.Scanner;

public class Print_prime_non_unit_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count; int n_count=0;
		System.out.print("Enter N value : ");
		int N = in.nextInt();
		
		for(int i=2;i<=1000;i++) {
			if(i%10 != 3) {
				count = 0;
				for(int j=2;j<=i/2;j++) {
					if(i%j ==0) {
						count++;
					}
				}
				if(count ==0) {
					n_count++;
					System.out.println(i);
				}
			}
			if(n_count == N) {     //print n prime num
				break;
			}
		}

	}

}
