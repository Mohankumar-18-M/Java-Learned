package task;
import java.util.Scanner;
public class Five_student_display {
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
		System.out.println();
	}

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
		Five_student_display stu1 = new Five_student_display();
		Five_student_display stu2 = new Five_student_display();
		Five_student_display stu3 = new Five_student_display();
		Five_student_display stu4 = new Five_student_display();
		Five_student_display stu5 = new Five_student_display();
		
		System.out.println("Enter student 1 details:");
		stu1.getinput(in, 1);
		System.out.println("Enter student 2 details:");
		stu2.getinput(in, 2);
		System.out.println("Enter student 3 details:");
		stu3.getinput(in, 3);
		System.out.println("Enter student 4 details:");
		stu4.getinput(in, 4);
		System.out.println("Enter student 5 details:");
		stu5.getinput(in, 5);
		
		stu1.diplay(1);
		stu2.diplay(2);
		stu3.diplay(3);
		stu4.diplay(4);
		stu5.diplay(5);
		

	}

}
