package Inheritance;
class class1{
	int c1v1 = 1000;
	void c1f1(){
		System.out.println("Class 1 executed");
	}
}
class class2 extends class1{
	int c2v2 = 100;
	void c2f2() {
		System.out.println("Class2 is executed");
	}
}
class class3 extends class2{
	int c3v3 = 10;
	void c3f3() {
		System.out.println("Class3 is executed");
	}
}
public class Multi_level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj1 = new class1();
		System.out.println(obj1.c1v1);
		obj1.c1f1();
		System.out.println();
		class2 obj2 = new class2();
		System.out.println(obj2.c1v1);
		System.out.println(obj2.c2v2);
		obj2.c1f1();
		obj2.c2f2();
		System.out.println();
		class3 obj3 = new class3();
		System.out.println(obj3.c1v1);
		System.out.println(obj3.c2v2);
		System.out.println(obj3.c3v3);
		obj3.c1f1();
		obj3.c2f2();
		obj3.c3f3();
	}

}
