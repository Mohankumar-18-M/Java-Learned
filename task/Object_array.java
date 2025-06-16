package task;

import java.util.Scanner;

public class Object_array {
	String name;
	char gender;
	int age,marks;
	String college_name ="Kncet";
	
	void diplay(int i) {
		System.out.println("Student "+i+" Details");
		System.out.println("name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		System.out.println("Marks:"+marks);
		System.out.println("College name: "+college_name);
		System.out.println();}
	
	void getinput(Scanner inp,int i) {
		System.out.print("Enter student "+i+" name: ");
		name = inp.next();
		System.out.print("Enter student "+i+" gender: ");
		gender = inp.next().charAt(0);
		System.out.print("Enter student "+i+" age: ");
		age = inp.nextInt();
		System.out.print("Enter student "+i+" marks: ");
		marks = inp.nextInt();
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Object_array obj[] = new Object_array[5];
		for(int i=1;i<=4;i++) {
			System.out.print(obj[i]);
			//obj[i].getinput(in, i);
		}
		for(int i=1;i<6;i++) {
			//obj[i].diplay(i);
		}

	}

}
