package conditional;

import java.util.Scanner;

public class Simple_if_elseif_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mark: ");
		int Mark = sc.nextInt();
		if(Mark<=100 && Mark>90) {
			System.out.println("Grade : O");
		}
		else if(Mark<=90 && Mark>80) {
			System.out.println("Grade : A+");
		}
		else if(Mark<=80 && Mark>70) {
			System.out.println("Grade : A");
		}
		else if (Mark<=70 && Mark>60) {
			System.out.println("Grade : B+");
		}
		else if(Mark<=60 && Mark>50) {
			System.out.println("Grade : B");
		}
		else if(Mark<=50 && Mark>40) {
			System.out.println("Grade : c");
		}
		else if(Mark<=40 && Mark>=0) {
			System.out.println("Grade : Fail");
		}
		else {
			System.out.println("Invalid Mark");
		}
		

	}

}
