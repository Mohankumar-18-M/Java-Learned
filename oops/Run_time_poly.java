package oops;

class class2{
	void func() {
		System.out.println("Class1 is executed");
	}
}
class class3 extends class2{
	void func(){
		System.out.println("Class2 is executed");
	}
}
public class Run_time_poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class2 obj = new class3();
		obj.func();

	}

}
