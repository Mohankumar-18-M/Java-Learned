package task;

import java.util.Scanner;

public class Smart_balance_checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter amount value : ");
		float amount = in.nextFloat();
		if(amount>0) {
			if(amount>=1000) {
				System.out.println("Your balance is sufficient");
			}
			
			
			else {
				System.out.println("Alert! Your balance is low.");
			}
		}
		
	else{
			System.out.println("Error: please enter a valid number");
		}

	}

}
