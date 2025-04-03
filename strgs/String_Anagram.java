package strgs;

import java.util.*;

public class String_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the String1: ");
		String str1 = ob.nextLine();
		System.out.print("Enter the String2: ");
		String str2 = ob.nextLine();
        char []char1 = str1.toCharArray();
        char []char2 = str2.toCharArray();
        if(str1.length() == str2.length()){
            Arrays.sort(char1);
            Arrays.sort(char2);
            boolean var = Arrays.equals(char1,char2);
            System.out.println(var);
        }
        else
            System.out.println("false");

	}

}
