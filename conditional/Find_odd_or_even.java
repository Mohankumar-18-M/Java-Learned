package conditional;
import java.util.Scanner;
public class Find_odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = ob.nextInt();
		if((a&1) == 1) {
			System.out.println("Given num "+a+" is odd");
		}
		else
			System.out.println("Given num "+a+" is even");

	}

}
