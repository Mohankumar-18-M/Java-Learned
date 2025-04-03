package array_Basic;

import java.util.Scanner;

public class Array_Two_dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row array size:");
		int s1 = sc.nextInt();
		System.out.print("Enter coloum size:");
		int s2 = sc.nextInt();
		System.out.println("Enetr array elements");
		int[][] arr = new int[s1][s2];
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Given array element:");
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
