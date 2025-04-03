package strgs;

import java.util.Scanner;

public class String_remove_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str1 = ob.nextLine();
		for (String s : str1.split(" ")) {
			System.out.print(s);
		}
		System.out.println();
		System.out.println(str1);
		String str2 = str1.replaceAll(" ","");
		System.out.println(str2);


	}

}
