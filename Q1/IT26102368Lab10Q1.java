import java.util.Scanner;

 public class IT26102368Lab10Q1{
   public static void main(String[] args){
   
     Scanner input = new 	Scanner(System.in);
   
     System.out.print("Enter the mark(0-100): ");
     int mark=input.nextInt();
   
     assert(mark>=0 && mark<=100): "Invalid mark";
   
     System.out.println("Mark is Validated");
	 
	 char Grade;
	 
	 if(mark>=75){
		 Grade='A';
	 }  else if(mark>=60){
		 Grade='B';
	 }  else if(mark>=50){
		 Grade='C';
	 }  else if(mark>=40){
		 Grade='D';
	 }  else {
		 Grade='F';
	 }
	 
	 if(mark>= 75){
		 assert( Grade=='A'): "Incorrect Grade Assigned";
	 	 
	 }else if(mark>= 60){
		  assert ( Grade=='B'): "Incorrect Grade Assigned";
		  
	 }else if (mark>= 50){
		   assert (Grade=='C'):"Incorrect Grade Assigned";
		   
	 }else if (mark>=40){
		    assert ( Grade=='D'):"Incorrect Grade Assigned";
			
	 }else {
		    assert (Grade =='F'):"Incorrect Grade Assigned";
	 }	
	
	System.out.println("The Grade for the Entered Mark is :" + Grade);
	 
	 
	 
	 
   }
   
 }