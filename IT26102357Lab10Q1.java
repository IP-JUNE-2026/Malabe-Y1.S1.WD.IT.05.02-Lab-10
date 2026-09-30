import java.util.Scanner;

public class IT26102357Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();
        
        
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
		System.out.println();
        System.out.println("Mark is Validated");
        
       
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
       
        boolean isGradeCorrect = (grade == 'A' && mark >= 75) ||
                                 (grade == 'B' && mark >= 60 && mark <= 74) ||
                                 (grade == 'C' && mark >= 50 && mark <= 59) ||
                                 (grade == 'D' && mark >= 40 && mark <= 49) ||
                                 (grade == 'F' && mark < 40);
                                 
        assert isGradeCorrect : "Incorrect Grade Assigned";
        
        System.out.println("The corresponding letter grade is: " + grade);
        
        
    }
}