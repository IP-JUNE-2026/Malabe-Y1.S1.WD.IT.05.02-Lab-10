import java.util.Scanner;

   public class IT26102193Lab10Q1B{
      public static void main(String[] args){
	  
	  Scanner input = new Scanner(System.in);
	  
	  int mark;
	  char grade;
	  
	  System.out.println();
	  
	  System.out.print("Enter a mark: ");
	  mark = input.nextInt();
	  
	  assert (mark>=0 && mark<=100) : "Invalid Mark";
	  
	  System.out.println();
	  System.out.println("Mark is validated");
	  
	  
	  if (mark>=75){
		  grade = 'A';
	  }
	  else if (mark>=60){
		  grade = 'B';
	  }
	  else if (mark>=50) {
		  grade = 'C';  
	  }
	  else if (mark>=40){
		  grade = 'D';
	  }
	  else {
		  grade = 'F';
	  }
	  
	  assert (mark>=75 && grade == 'A') ||
	   (mark>=60 && mark<75 && grade == 'B') || 
	   (mark>=50 && mark<60 && grade == 'C') ||
	   (mark>=40 && mark<50 && grade == 'D') ||
	   (mark>=0 && mark<40 && grade == 'F') : "Incorrect Grade";
	  
	  System.out.println("The Grade for the Entered Mark is: " +grade);
	  
	  }
   }
   