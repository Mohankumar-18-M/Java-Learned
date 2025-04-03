package conditional;
import java.util.Scanner;
public class Pos_or_neg_ternary_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = ob.nextInt();
		System.out.println((a==0)?"Given num is zero":(a>0)?"Given num is positive":"Given num is negative");


	}

}
