package strgs;

public class String_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(a);
		String str1 = "Mohan";
		String str2 = "Kumar";
		String str3 = "Mohan";
		String str5 = "Mohan kumar";
		// string str4 = new String("Mohan");
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.trim());
		System.out.println(str1.substring(1, 3));
		for (String s : str5.split("k")) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println(str5);
		System.out.println();

	}

}
