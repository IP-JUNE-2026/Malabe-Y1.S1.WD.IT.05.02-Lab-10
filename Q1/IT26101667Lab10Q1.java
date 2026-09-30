import java.util.Scanner;
public class IT26101667Lab10Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		
		System.out.print("Enter the mark (0 - 100) :");
		int mark = input.nextInt();
		
		assert (mark >= 0 && mark <= 100):"Invalid Mark";
		
		System.out.println();
		System.out.println("Mark is Validated");
		
		char grade;
		if (mark >= 75){
			grade = 'A';
		}
		else if(mark >= 60){
			grade = 'B';
		}
		else if(mark >= 50){
			grade = 'C';
		}
		else if(mark >= 40){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		
		assert (mark <= 100 && mark >= 75 && grade == 'A')
			|| (mark <= 74 && mark >= 60 && grade == 'B')
			|| (mark <= 59 && mark >= 50 && grade == 'C')
			|| (mark <= 49 && mark >= 40 && grade == 'D')
			|| (mark <= 39 && mark >= 0 && grade == 'F'):
			"Incorrect Grade Assigned";
			
		
		System.out.print("The Grade for Entered Mark is :"+ grade);
	}
	
}