package oops;
class one{
	static void demo() {
		System.out.println("Null func executed");
	}
	static void demo(int n) {
		System.out.println("int 1 func executed");
	}
	static void demo(String s) {
		System.out.println("String  func executed");
	}
	static void demo(int m,int n) {
		System.out.println("int 2 func executed");
	}
}
public class Poly_morphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one.demo();
		one.demo(6);
		one.demo("hello");
		one.demo(6,7);
		one.demo('a');

	}

}
