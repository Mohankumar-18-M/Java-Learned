package oops;
abstract class abs_cls{  //abstract cannot has obj
	void func_non_abs() {
		System.out.println("non abs class");
	}
	abstract void func_asb();  // abstract func only declared 
}
abstract class abs_cls_2 extends abs_cls{
	void func_abs() {  // abstacted function may or may not be defined in abstract class
		System.out.println("abstract func is executed");
	}
}
class non_abs_cls extends abs_cls{
	void func_abs() {  // abstracted function definition is must be in non 
		System.out.println("abstract func is executed");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		non_abs_cls obj = new non_abs_cls();
		obj.func_abs();
		obj.func_non_abs();

	}

}
