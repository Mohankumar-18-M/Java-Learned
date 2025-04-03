package strgs;

public class String_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="hello";
		String str2 ="hello";
		String str3 = new String("hello");
		String str4 = new String("ehllo");
		//String str5 = str1.replaceAll
		System.out.println(str1.length());
		System.out.println(str1);
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1.equals(str4));
		System.out.println(str1.charAt(0));
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.indexOf("ell"));
		

	}

}
