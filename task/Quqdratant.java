package task;

import java.util.Scanner;

public class Quqdratant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter X : ");
		int X = in.nextInt();
		System.out.print("Enter X : ");
		int Y = in.nextInt();
		if(X>0 && Y>0) {
			System.out.println("Quadrant 1");
		}
		else if(X<0 && Y>0) {
			System.out.println("Quadrant 2");
		}
		else if(X<0 && Y<0) {
			System.out.println("Quadrant 3");
		}
		else if(X>0 && Y<0) {
			System.out.println("Quadrant 4");
		}
		System.out.println((X>0)?((Y>0)?"Quadrant 1":"Quadrant 4"):((Y>0)?"Quadrant 2":"Quadrant 3"));
		

	}

}
