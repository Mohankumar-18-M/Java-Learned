package task;

import java.util.Scanner;

public class Tax_flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter amount value : ");
		float income = in.nextFloat();
		System.out.print("Enter dependents number: ");
		int N = in.nextInt();
		float tax=0;
		if(income >0) {
			if(income > 80000 && N==0) {
				tax = (income/10)*3; 
			}
			else if(income> 80000 && N>0) {
				tax = (income/10)*2;
			}
			else if(income<80000) {
				tax = (income/10);
				//tax=(tax*100.00f)/100.00f;
			}
		}
		else {
			System.out.println("Enter valid amount");
		}
		System.out.printf("the tax : %.2f",tax);

	}

}
