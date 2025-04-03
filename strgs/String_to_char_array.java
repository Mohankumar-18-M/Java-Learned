package strgs;

public class String_to_char_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Mohan";
		char[] b = a.toCharArray();
		System.out.print("['");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
			if(i<b.length-1) {
				System.out.print("','");
			}
		}
		System.out.print("']");

	}

}
