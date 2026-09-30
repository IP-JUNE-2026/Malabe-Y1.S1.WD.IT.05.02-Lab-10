import java.util.Scanner;

   public class IT26102193Lab10Q1A{
      public static void main(String[] args){
	  
	  Scanner input = new Scanner(System.in);
	  
	  int mark;
	  
	  System.out.println();
	  
	  System.out.print("Enter a mark: ");
	  mark = input.nextInt();
	  
	  assert (mark>=0 && mark<=100) : "Invalid Mark";
	  
	  System.out.println();
	  System.out.println("Mark is validated");
	  
	  }
   }
   