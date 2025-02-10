
import java.util.Scanner;  
import java.util.InputMismatchException;  

public class Question5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
        
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();  
            
            // Perform division
            int result = 100 / number;  
            System.out.println("Result: 100 / " + number + " = " + result);
            
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
            
        } catch (InputMismatchException e) {
            // Handle non-integer input
            System.out.println("Error: Please enter a valid integer.");
            
        } finally {
            scanner.close();  // Close the scanner
            System.out.println("Program execution completed.");
        }
    }
}

