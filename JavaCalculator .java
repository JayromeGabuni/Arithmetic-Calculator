import java.util.*;

public class JavaCalculator {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        //First
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Your number is: " + firstNumber);

        //Second
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Your number is: " + secondNumber);
    
    //Solutions/Equations
    
    double addition = firstNumber + secondNumber;
    double subtraction = firstNumber - secondNumber;
    double multiplication = firstNumber * secondNumber;
    double division = secondNumber != 0 ? firstNumber / secondNumber : Double.NaN;
    
    //Results
    
    System.out.println("\nResults:");
    System.out.println("Addition: " + addition);
    System.out.println("Subtraction: " + subtraction);
    System.out.println("Multiplication: " + multiplication);
    if (secondNumber != 0) {
      System.out.println("Division: " + division);
    }else{
      System.out.println("Division: Cannot divide by Zero");
      
      //Close 
      
      scanner.close();
    }
  }
}
