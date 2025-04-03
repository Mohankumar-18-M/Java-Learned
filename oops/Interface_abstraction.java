package oops;
interface infce_cls{
	int var = 10;  // public static final int var = 10;
	
	void func();   //public abstract void func();
	
	default void func_dft() {   //default keyward is for default function
		System.out.println("Default function");
	}
}
class nor_cls extends infce_cls{
	
}
public class Interface_abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
