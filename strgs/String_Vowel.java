package strgs;

import java.util.Scanner;

public class String_Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the string:");
		String str1 = ob.nextLine();
		int V_count =0;
		int C_count =0;
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') {
				V_count++;
			}
			else
				C_count++;
		}
		System.out.println("Vowel count: "+V_count);
		System.out.println("Consonant count: "+C_count);
		

	}

}
