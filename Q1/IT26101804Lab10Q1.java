import java.util.Scanner;

public class IT26101804Lab10Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        assert mark >= 0 && mark <= 100 : "Invalid Mark";

        System.out.println("Mark is Validated");

        input.close();
    }
}
