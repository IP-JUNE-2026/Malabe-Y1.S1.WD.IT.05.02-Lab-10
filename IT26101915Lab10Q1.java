import java.util.Scanner;

public class IT26101915Lab10Q1{

   public static void main(String[]args){
   
      Scanner input= new Scanner(System.in);
	  
	  System.out.println();
	  System.out.print("Enter the mark (0-100): ");
	  int mark =input.nextInt();
	  
	  assert (mark>=0 && mark<=100): "Invalid Mark";
	  
	  System.out.println();
	  System.out.print("Mark is Validated");
	}
}