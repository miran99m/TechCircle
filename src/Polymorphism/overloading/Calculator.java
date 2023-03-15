package Polymorphism.overloading;

public class Calculator {

	// Add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Subtract two doubles
    public double subtract(double a, double b) {
        return a - b;
    }
    
    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }
    
    // Divide two integers
    public int divide(int a, int b) {
        return a / b;
    }
    
    // Divide two doubles
    public double divide(double a, double b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Test the add method
        System.out.println("Addition:");
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2.5, 3.5));
        
        // Test the subtract method
        System.out.println("Subtraction:");
        System.out.println(calculator.subtract(5, 3));
        System.out.println(calculator.subtract(5.5, 3.5));
        
        // Test the multiply method
        System.out.println("Multiplication:");
        System.out.println(calculator.multiply(2, 3));
        System.out.println(calculator.multiply(2.5, 3.5));
        
        // Test the divide method
        System.out.println("Division:");
        System.out.println(calculator.divide(6, 3));
        System.out.println(calculator.divide(6.0, 3.0));
    }
}
