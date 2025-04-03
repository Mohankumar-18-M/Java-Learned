package Basics;

public class Simple_Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b=4;
		int c = a + b;
		System.out.println(c);
		a++;
		b = a++ + ++a + a;   // 3 + 5 +5
		System.out.println(b);

	}

}
