import java.util.Scanner;

public class Lab10Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0-100): ");
        int mark = input.nextInt();

        assert mark >= 0 && mark <= 100 : "Invalid Mark";

        System.out.println("Mark is Validated");

        char grade;

        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 65) {
            grade = 'B';
        } else if (mark >= 55) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        if (mark >= 75) {
            assert grade == 'A' : "Incorrect Grade Assigned";
        } else if (mark >= 65) {
            assert grade == 'B' : "Incorrect Grade Assigned";
        } else if (mark >= 55) {
            assert grade == 'C' : "Incorrect Grade Assigned";
        } else if (mark >= 40) {
            assert grade == 'D' : "Incorrect Grade Assigned";
        } else {
            assert grade == 'F' : "Incorrect Grade Assigned";
        }

        System.out.println("The Grade for the Entered Mark is: " + grade);

    }
}
