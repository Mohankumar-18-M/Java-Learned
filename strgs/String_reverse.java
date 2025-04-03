package strgs;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1 = "Mohankumar";
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str1 = ob.nextLine();
		System.out.print("The string is: ");
		for(int i=0;i<str1.length();i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		System.out.print("The reverse of string: ");
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}

	}

}
