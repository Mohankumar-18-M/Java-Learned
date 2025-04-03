package strgs;

public class String_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str1 = new StringBuilder("IPL");
		System.out.println(str1);
		
		str1.append(" Wins");
		System.out.println(str1);
		
		str1.insert(3, " Trophy");
		System.out.println(str1);
		
		str1.replace(4, 10, "RCB");
		System.out.println(str1);
		
		str1.delete(4, 7);
		System.out.println(str1);
		

	}

}
