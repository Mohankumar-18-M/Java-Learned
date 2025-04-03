package array_Basic;

import java.util.Scanner;

public class Array_Two_Value_Add_Target 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size:");
		int s = sc.nextInt();
		int[] arr = new int[s];
		System.out.println("Enter array element:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter target value: ");
		int tar = sc.nextInt();
		System.out.println("Target valued indexes:");
		for(int i=0;i<s;i++) 
		{
			for(int j=i+1;j<s;j++) 
			{
				if(arr[i] + arr[j] == tar) 
				{
					System.out.println("("+i+","+j+")");
					flag = true;
				}
				
			}
		}
		if(flag) {
			break;
		}

	}

}
