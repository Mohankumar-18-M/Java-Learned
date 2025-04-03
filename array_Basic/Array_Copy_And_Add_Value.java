package array_Basic;

import java.util.Scanner;

public class Array_Copy_And_Add_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array1 size: ");
		int array1_len =sc.nextInt();
		int []arr1 = new int[array1_len];
		System.out.println("Enter array elements: ");
		for(int i=0;i<array1_len;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter value to inserted:");
		int tar = sc.nextInt();
		System.out.println("Enter index to add(<"+(array1_len+1)+")");
		int index = sc.nextInt();
		int array2_len = array1_len +1;
		if(index <array2_len) {
		int []arr2 = new int[array2_len];
		int j=0;
		for(int i=0;i<array2_len;i++) {
			if(i==index) {
				arr2[i] = tar;
			}
			else {
				arr2[i] = arr1[j];
				j++;
			}
		}
		System.out.println("Array copied and value added array is:");
		for(int i=0;i<array2_len;i++) {
			System.out.println(arr2[i]);
		}
		}
		else {
			System.out.println("Invalid size");
		}

	}

}
