import java.util.Scanner;

public class IT26102363Lab10Q1{
	
	public static void main(String[] niko){
		
		int marks;
		char grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the mark (0-100) :");
		marks = input.nextInt();
		
		assert (marks >= 0 && marks <= 100): "Invalid Mark";
		
		System.out.print("Mark is validated");
		
		if (marks >= 75){
			grade = 'A';
		}
		else if (marks >= 60){
			grade = 'B';
		}
		else if (marks >= 50){
			grade = 'C';
		}
		else if (marks >= 40){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		if (marks >= 75){
			assert grade == 'A' : "Incorrect grade assined ";
		}
		else if (marks >= 60){
			assert grade == 'B' : "Incorrect grade assined ";
		}
		else if (marks >= 50){
			assert grade == 'C' : "Incorrect grade assined ";
		}
		else if (marks >= 40){
			assert grade == 'D' : "Incorrect grade assined ";
		}
		else {
			assert grade == 'F' : "Incorrect grade assined ";
		}
		
		System.out.print("The grade for the entered mark is : " +grade );
		 
	}
}