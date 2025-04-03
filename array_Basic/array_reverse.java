package array_Basic;

public class array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		a[0] = 11;
		a[1] = 22;
		a[2] = 333;
		a[3] = 44;
		a[4] = 55;
		
		System.out.println("Before rev:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("after rev:");
		for(int i=(a.length-1);i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}
