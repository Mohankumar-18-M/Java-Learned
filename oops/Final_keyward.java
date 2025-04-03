package oops;
class cls{
	final static double PI = 3.24;
	final void func() {
		System.out.println("The class final func is executed");
	}
}
class cls2 extends cls{
	void func1() { //func() is error coz final keyward
		System.out.println("the class 2 func is executed");
	}
}
public class Final_keyward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cls.PI = 3.67;  //the final keyword variable does not be changed 
		System.out.println(cls.PI);
		

	}

}
