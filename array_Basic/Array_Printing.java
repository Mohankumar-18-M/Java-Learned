package array_Basic;

public class Array_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		a[0] = 11;
		a[1] = 22;
		a[2] = 333;
		a[3] = 44;
		a[4] = 55;
		a[5] = 66;
		a[6] = 77;
		a[7] = 88;
		a[8] = 99;
		a[9] = 100;
		System.out.println("Array elements are: ");
		for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		System.out.println("Array Even index values:");
		for(int i=0;i<a.length;i++) {
			if(i%2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Array Odd index values: ");
		for(int i=0;i<a.length;i++) {
			if(i%2 == 1) {
				System.out.println(a[i]);
			}
		}

	}

}
