package Inheritance;
class base{
	void func() {
		System.out.println("Class base executed");
	}
}
class inher1 extends base{
	void func_inh1() {
		System.out.println("Class inherited 1 is executed");
	}
}
class inher2 extends base{
	void func_inh2() {
		System.out.println("Class inherited 2 is executed");
	}
}
public class Hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inher1 obj1 = new inher1();
		inher2 obj2 = new inher2();
		obj1.func_inh1();
		obj1.func();
		System.out.println();
		obj2.func_inh2();
		obj2.func();

	}

}
