package array_Basic;

import java.util.Scanner;

public class Array_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int array_len =sc.nextInt();
		int []arr = new int[array_len];
		System.out.println("Enter array elements: ");
		for(int i=0;i<array_len;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter target value to delete: ");
		int tar1 = sc.nextInt();
		for(int i=0;i<array_len;i++) {
			if(arr[i] == tar1) {
				for(int j=i;j+1<(array_len);j++) {
					arr[j] = arr[j+1];
				}
				arr[(array_len-2)] = arr[array_len-1
				                         
				                         
				                         ];
				array_len--;
				break;
			}
		}
		System.out.println("Array after value is deleted");
		for(int i=0;i<array_len;i++) {
			System.out.println(arr[i]);
		}

	}

}
