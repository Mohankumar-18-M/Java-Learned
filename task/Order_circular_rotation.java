package task;

import java.util.Scanner;

public class Order_circular_rotation {
	static int find_small(int n) {
		int temp = n;int small =temp%10;
		while(temp != 0) {
			
			int digit = temp%10;
			if(small > digit) {
				small = digit;
			}
			temp /= 10;
			
		}
		return small;
	}
	
	static int circular(int n,int s,int c) {
		int temp = n;int last_digit;
		while(temp != 0) {
			int digit = temp%10;
			if(digit == s) {
				return temp;
			}
			else {
				last_digit = temp%10;
				int remaining = temp/10;
				int multiplier =1;
				for(int i=0;i<c-1;i++) {
					multiplier = multiplier*10;
				}
				temp = last_digit*multiplier+remaining;
			}
			//System.out.println(temp);
		}
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int N = in.nextInt();
		int temp = N;int n_size=0;int small;
		while(temp != 0) {
			int digit = temp%10;
			n_size++;
			temp /=10;
		}
		temp = N;
		int store_res =0;
		while(temp != 0) {
		small = find_small(temp);
		temp = circular(temp,small,n_size);
		store_res = (store_res*10)+small;
		//System.out.print(" "+small+" ");
		//System.out.println(temp);
		temp = temp /10;
		n_size--;
		//System.out.println(temp);
		
		}
		System.out.println("The num after arranged : "+store_res);
	
	}
		
		

	}


