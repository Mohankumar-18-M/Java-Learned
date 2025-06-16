package task;
import java.util.Scanner;
public class Odd_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int N = in.nextInt();
		for(int i=1;i<=N;i++) {
			if(i>=26 && i<=40) {
				if(i%2 == 0) {
				System.out.println(i);
				}
			}
		}
	}

}
