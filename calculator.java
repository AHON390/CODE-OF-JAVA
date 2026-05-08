import java.util.Scanner;

// Base class containing the mathematical operations
class Operations {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}

// Child class inheriting from Operations
class Calculator extends Operations {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Java Inheritance Calculator ---");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        
        switch (operator) {
            case '+': result = add(num1, num2); break;
            case '-': result = subtract(num1, num2); break;
            case '*': result = multiply(num1, num2); break;
            case '/': result = divide(num1, num2); break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.start();
    }
}
