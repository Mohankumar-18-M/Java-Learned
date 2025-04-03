package oops;
class parent{
	int var = 100000;
	void func() {
		System.out.println("Class 1 is executed");
	}
}
class child extends parent{
	int var = super.var+50000;
	void func() {
		super.func();
		System.out.println("Class2 is executed");
	}
}
public class Super_keyward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child();
		System.out.println(c.var);
		c.func();

	}

}
