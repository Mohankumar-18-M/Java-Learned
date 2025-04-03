package oops;
class c1{
	c1(){  //  c1(int v)  may cause error coz super(); in child class
		System.out.println("Constructor of class 1");
	}
}
class c2 extends c1{
	c2(){
		//super();  is in default    
		System.out.println("Contructor of class 2");
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		c2 obj = new c2();
		

	}

}
