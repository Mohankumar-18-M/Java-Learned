package array_Basic;

import java.util.Scanner;

public class Two_dim_array_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row array1 size:");
		int row1 = sc.nextInt();
		System.out.print("Enter coloum array1 size:");
		int col1 = sc.nextInt();
		System.out.println("Enetr array1 elements");
		int[][] arr1 = new int[row1][col1];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter row array2 size:");
		int row2 = sc.nextInt();
		System.out.print("Enter coloum array2 size:");
		int col2 = sc.nextInt();
		System.out.println("Enetr array2 elements");
		int[][] arr2 = new int[row2][col2];
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		if((row1 == row2)&&(col1 == col2)) {
		System.out.println("The added matrix:");
		for(int  i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
			System.out.print((arr1[i][j]+arr2[i][j])+" ");
		}
			System.out.println();
		}
		}
		else
			System.out.println();

	}

}
