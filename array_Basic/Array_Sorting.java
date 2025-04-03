package array_Basic;

import java.util.Scanner;

public class Array_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size:");
		int s = sc.nextInt();
		int[] arr = new int[s];
		int sum=0;
		System.out.println("Enter array element:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Given array elements:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Array after sorting:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			sum = sum+arr[i];
		}
		System.out.println("Max in array: "+arr[s-1]);//-1 values not accepted
		System.out.println("Min in array: "+arr[0]); 
		System.out.println("Sum of all element in array = "+sum);

	}
}
